package com.ltts.movieapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	private int ticketNo;
	private String movieName;
	private String circleType;
	private Date dateOfBooking;
	private Date showDate;
	private Date showTiming;
	private int noOfTickets;
	public int getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getCircleType() {
		return circleType;
	}
	public void setCircleType(String circleType) {
		this.circleType = circleType;
	}
	public Date getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public Date getShowTiming() {
		return showTiming;
	}
	public void setShowTiming(Date showTiming) {
		this.showTiming = showTiming;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	
	public Ticket(int ticketNo, String movieName, String circleType, Date dateOfBooking, Date showDate, Date showTiming,
			int noOfTickets) {
		super();
		this.ticketNo = ticketNo;
		this.movieName = movieName;
		this.circleType = circleType;
		this.dateOfBooking = dateOfBooking;
		this.showDate = showDate;
		this.showTiming = showTiming;
		this.noOfTickets = noOfTickets;
	}
	public Ticket() {
		super();
	}
	
	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + ", movieName=" + movieName + ", circleType=" + circleType
				+ ", dateOfBooking=" + dateOfBooking + ", showDate=" + showDate + ", showTiming=" + showTiming
				+ ", noOfTickets=" + noOfTickets + "]";
	}
		
}
