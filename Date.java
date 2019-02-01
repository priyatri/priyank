package com.capgemini.beans;

public class Date {

	private int day,month,year;

	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}

	String display()
	{
		return Integer.toString(day)+"/"+Integer.toString(month)+"/"+Integer.toString(year);
		
	}
}
