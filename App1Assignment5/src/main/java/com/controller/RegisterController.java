package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Users;
import com.service.RegisterService;

@Controller
public class RegisterController {
	
	@Autowired
	Users users;
	
	@Autowired
	RegisterService registerService;
	
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String getRegisterRedirect() {
		return "redirect:register.jsp";
	}
	
	@PostMapping("/Register") // for post method mapping
	public ModelAndView addUsers(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mv = new ModelAndView();

		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");

		users.setUname(uname);
		users.setPass(pass);
		

//		System.out.println(book);
		registerService.saveUser(users, "POST");
//		HttpSession session = request.getSession();
		mv.setViewName("login");

		return mv;
	}


}
