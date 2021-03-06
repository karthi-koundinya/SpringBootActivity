package com.ltts.movieapp.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ltts.movieapp.bo.TicketBo;
import com.ltts.movieapp.model.Ticket;

@RestController
public class TicketController<login> {
	
	@Autowired
	TicketBo tb;
	
	@RequestMapping("/index")
	public ModelAndView m1() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/bookticket")
	public ModelAndView m2() {
		return new ModelAndView("bookticket");
	}
	@RequestMapping(value="bookingticket",method=RequestMethod.POST)
	public ModelAndView m3(HttpServletRequest request) throws Exception {
		ModelAndView mv=null;
		String mname=request.getParameter("mname");
		String circleType=request.getParameter("circletype");
		String bdate=request.getParameter("dateofbooking");
		String sdate=request.getParameter("showdate");
		String stime=request.getParameter("showtime");
		DateFormat formatter1 = new SimpleDateFormat("YYYY-MM-DD"); 
		Date showtime = formatter1.parse(stime);
		Date showdate = formatter1.parse(sdate);
		Date dateofbooking = formatter1.parse(bdate);
		int noOfTicket=Integer.parseInt(request.getParameter("noofticket"));
		Ticket t=new Ticket(0,mname,circleType,dateofbooking,showdate,showtime,noOfTicket);
		boolean b=false;
		try {
			tb.save(t);
		}
		catch(Exception e) {
			b=true;
		}
		if(b==false) {
			mv=new ModelAndView("success");	
		}
		else {
			mv=new ModelAndView("error");
		}
		return mv;
	}
	
}
