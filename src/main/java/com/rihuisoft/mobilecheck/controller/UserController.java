package com.rihuisoft.mobilecheck.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rihuisoft.mobilecheck.entity.User;
import com.rihuisoft.mobilecheck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * 获取所有用户列表
	 * @param request
	 * @return
	 */
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request){

		List<User> findAll = userService.findAll();
		request.setAttribute("userList", findAll);
		return "/allUser";
	}

	/**
	 * 获取所有用户列表
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getAllUserJson")
	public List<User> getAllUserJson(HttpServletRequest request){

		List<User> findAll = userService.findAll();

		//request.setAttribute("userList", findAll);
		//return "/allUser";
		return userService.findAll();
	}

	/**
	 * 获取所有用户列表
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/id/{id}",method= RequestMethod.GET,params="json")
	@ResponseBody
	public User getUserJson(@PathVariable int id){
		return userService.findById(id);
	}


	/**
	 * 跳转到添加用户界面
	 * @param request
	 * @return
	 */
	@RequestMapping("/toAddUser")
	public String toAddUser(HttpServletRequest request){

		return "/addUser";
	}
	/**
	 * 添加用户并重定向
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping("/addUser")
	public String addUser(User user,HttpServletRequest request){
		userService.save(user);
		return "redirect:/user/getAllUser";
	}

	/**
	 *编辑用户
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/updateUser",method = RequestMethod.POST)
	public String updateUser(User user,HttpServletRequest request){


		if(userService.update(user)){
			user = userService.findById(user.getId());
			request.setAttribute("user", user);
			return "redirect:/user/getAllUser";
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
	@RequestMapping("/getUser")
	public String getUser(int id,HttpServletRequest request){

		request.setAttribute("user", userService.findById(id));
		return "/editUser";
	}
	/**
	 * 删除用户
	 * @param id
	 * @param request
	 * @param response
	 */
	@RequestMapping("/delUser")
	public void delUser(int id,HttpServletRequest request,HttpServletResponse response){
		String result = "{\"result\":\"error\"}";

		if(userService.delete(id)){
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
