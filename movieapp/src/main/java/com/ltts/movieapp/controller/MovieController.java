package com.ltts.movieapp.controller;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.movieapp.bo.MovieBo;
import com.ltts.movieapp.model.Movie;

@RestController
public class MovieController {

	
	@Autowired
	MovieBo mv;
	
	
	@RequestMapping("/addmovie")
	public ModelAndView m1() {
		return new ModelAndView("addmovie");
	}
	
	
	@RequestMapping(value="insertmovie",method=RequestMethod.POST)
	public ModelAndView addmovie(HttpServletRequest request) throws Exception {
		
	ModelAndView mav=null;
	int mid=Integer.parseInt(request.getParameter("mid"));
	String mname=request.getParameter("mname");
	String dname=request.getParameter("dname");
	String language=request.getParameter("language");
	String hname=request.getParameter("hname");
	String hinname=request.getParameter("hinname");
	String rdate1 =request.getParameter("rdate");;
	DateFormat formatter1 = new SimpleDateFormat("YYYY-MM-DD"); 
	Date rdate = formatter1.parse(rdate1);
	Movie m=new Movie(mid,mname,dname,hname,hinname,language,rdate);
	boolean b=false;
	try {
		mv.save(m);
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
