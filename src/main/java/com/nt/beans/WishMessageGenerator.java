package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
//Has-A Property(supporting composition)
	private Date date;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param constructor");
	}

	// setter method for setter injection (Alt+shift+s, r->select setDate(-)-->ok)
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate(-)");
		this.date = date;
	}

	// B.method
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		// get current hour of the day
		int hour = date.getHours();// 24 hours format (0 to 23)
		// generate wish message
		if (hour < 12)
			return "Good Morning::" + user;
		else if (hour < 16)
			return "Good After Noon::" + user;
		else if (hour < 20)
			return "Good Evening::" + user;
		else
			return "Good Night::" + user;
	}// method
}// class
