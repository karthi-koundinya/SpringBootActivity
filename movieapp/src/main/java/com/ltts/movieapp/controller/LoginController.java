package com.ltts.movieapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.movieapp.bo.CustomerBo;
import com.ltts.movieapp.model.Customer;

@RestController
public class LoginController {

	@Autowired
	CustomerBo cb;
	
	
	@RequestMapping("/login")
	public ModelAndView m1() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/welcome")
	public ModelAndView m2() {
		return new ModelAndView("welcome");
	}
	 
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
			
		String email=request.getParameter("email");
		String mobile=request.getParameter("psw");   
		Customer c = cb.findByEmailAndMobile(email,mobile);
		boolean b=false;
		try {
			cb.findAll();
		}
		catch(Exception e) {
			b=true;
		}
		if(b==false)
		{
			String uname=c.getEmail();
			String upass=c.getMobile();
		
			if(email.equalsIgnoreCase(uname) && mobile.equalsIgnoreCase(upass)) 
			{
				
				return new ModelAndView("welcome");
			}
			else 
			{
				return new ModelAndView("error");
			}
		}
		
		return new ModelAndView("error");
		
	 }
}

