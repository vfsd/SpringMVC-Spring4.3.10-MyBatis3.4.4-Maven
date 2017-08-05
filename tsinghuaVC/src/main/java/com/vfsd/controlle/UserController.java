package com.vfsd.controlle;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vfsd.model.User;
import com.vfsd.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	//@RequestMapping("/{id}/showUser")
	@RequestMapping(value="/showUser")
	@ResponseBody
	public String showUser(@RequestParam(value="iid", required=false) int id, HttpServletRequest request) {
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		return u.getName();
	}
	
	@RequestMapping(value="/mvc",method=RequestMethod.GET)    
    public String HelloWorld(Model model){    
        
        model.addAttribute("message","Hello Spring MVC!!!");  //传参数给前端  
          
      //视图渲染，/WEB-INF/view/HelloWorld.jsp  
        return "showUser";  //页面的名称，根据此字符串会去寻找名为HelloWorld.jsp的页面  
    } 

}
