package com.rihuisoft.mobilecheck.controller;

import com.rihuisoft.mobilecheck.entity.User;
import com.rihuisoft.mobilecheck.service.UserService;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by enyva on 15/12/9.
 */
@Controller
@RequestMapping("/logins")
public class LoginController {

    @Autowired
    private UserService userService;
    private Logger log = Logger.getLogger(LoginController.class);


    /**
     * 用户登录系统
     * @return
     */
    @RequestMapping(value="/login")
    public ModelAndView login(HttpServletRequest request, HttpSession session){

        User user = null;
        List<Module> moduleList = null;
        try {
            //TwiooID
            Integer userId = ServletRequestUtils.getIntParameter(request, "userId");


            //user = loginManagerService.login(twiooId, 3);
            user = userService.findById(userId);
            if(null != user){
                moduleList = (List<Module>) userService.findById(user.getId());
            }
            session.setAttribute("user", user);
            session.setAttribute("permit", moduleList);
            session.setAttribute("user", user);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("LoginController.login() execute error!!!");
        }
        System.out.println("login...................");
        return new ModelAndView("index");
    }


    /**
     * 用户退出系统
     * @return
     */
    @RequestMapping(value="/exit")
    public ModelAndView exit(HttpServletRequest request,HttpSession session){

        session.removeAttribute("user");
        session.removeAttribute("permit");
        session.removeAttribute("twiooId");
        session.removeAttribute("twiooId");
        System.out.println("exit....................");
        return new ModelAndView("index");
    }


    /**
     * 测试返回JSON数据
     * @param session
     * @return
     */
    @RequestMapping(value="/test")
    @ResponseBody
    public Object test(HttpSession session){

        System.out.println("test....................");
        return session.getAttribute("permit");
    }
}
