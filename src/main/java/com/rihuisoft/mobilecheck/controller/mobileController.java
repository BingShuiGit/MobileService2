package com.rihuisoft.mobilecheck.controller;

import com.rihuisoft.mobilecheck.entity.MobileInfo;
import com.rihuisoft.mobilecheck.entity.User;
import com.rihuisoft.mobilecheck.service.MobileInfoService;
import com.rihuisoft.mobilecheck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/mobile")
public class mobileController {

	@Autowired
	private MobileInfoService mobileInfoService;

	/**
	 * 获取DB手机列表
	 * @param request
	 * @return
	 */

	@RequestMapping("/getAll")
	public String getAllUser(HttpServletRequest request){

		List<MobileInfo> findAll = mobileInfoService.findAll();
		request.setAttribute("mobileList", findAll);
		return "/allMobile";
	}

	/**
	 * 获取所有用户列表
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllJson")
	public List<MobileInfo> getAllUserJson(HttpServletRequest request){

		List<MobileInfo> findAll = mobileInfoService.findAll();

		//request.setAttribute("userList", findAll);
		//return "/allUser";
		return mobileInfoService.findAll();
	}

	/**
	 * 获取所有用户列表
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/id/{id}",method= RequestMethod.GET,params="json")
	@ResponseBody
	public MobileInfo getUserJson(@PathVariable int id){
		return mobileInfoService.findById(id);
	}

	/**
	 * 跳转到添加用户界面
	 * @param request
	 * @return
	 */
	@RequestMapping("/toAddMobile")
	public String toAddUser(HttpServletRequest request){

		return "/addMobile";
	}
	/**
	 * 添加用户并重定向
	 * @param mobileInfo
	 * @param request
	 * @return
	 */
	@RequestMapping("/addMobile")
	public String addUser(MobileInfo mobileInfo,HttpServletRequest request){
		mobileInfoService.save(mobileInfo);
		return "redirect:/mobile/getAll";
	}
	/**
	 *编辑用户
	 * @param mobile
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateMobile",method = RequestMethod.POST)
	public String updateMobile(MobileInfo mobile,HttpServletRequest request){
		if(mobileInfoService.update(mobile)){
			mobile = mobileInfoService.findById(mobile.getId());
			request.setAttribute("mobile", mobile);
			return "redirect:/mobile/getAll";
		}else{
			return "/error";
		}
	}
	/**
	 * 根据id查询单个用户
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("/getById")
	public String getById(int id,HttpServletRequest request){

		request.setAttribute("mobile", mobileInfoService.findById(id));
		return "/editMobile";
	}
	/**
	 * 删除用户
	 * @param id
	 * @param request
	 * @param response
	 */
	@RequestMapping("/delMobile")
	public void delMobile(int id,HttpServletRequest request,HttpServletResponse response){
		String result = "{\"result\":\"error\"}";

		if(mobileInfoService.delete(id)){
			result = "{\"result\":\"success\"}";
		}

		response.setContentType("application/json");

		try {
			PrintWriter out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
