package com.ltts.movieapp.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.movieapp.bo.CustomerBo;
import com.ltts.movieapp.model.Customer;





@RestController
public class HomeController {
	

	@Autowired
	CustomerBo cb;
	
	
	@RequestMapping("/")
	public ModelAndView m1() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView m2() {
		return new ModelAndView("register");
	}
	
	    
	 @RequestMapping(value="insertuser",method=RequestMethod.POST)
		public ModelAndView m3(HttpServletRequest request) {
			
			ModelAndView mav=null;
			String email=request.getParameter("email");
			String name=request.getParameter("uname");
			String mobile=request.getParameter("mobile");
			String location=request.getParameter("location");
			//application context
			Customer c=new Customer(email,name,mobile,location);
			boolean b=false;
			try {
				cb.save(c);
			}
			catch(Exception e) {
				b=true;
			}
			if(b==false) {
				mav=new ModelAndView("success");	
			}
			else {
				mav=new ModelAndView("error");
			}
			return mav;
		}
}
