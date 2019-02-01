package com.capgemini.beans;

public class Contract_Based_Employee extends Employee
{
int hours;
Contractor contractor;
static int count=0;
	public Contract_Based_Employee(String fname, String lname, double salary, Date doj,int hours,Contractor contractor) {
		super(fname, lname, hours*contractor.getRate(), doj);
		this.hours=hours;
		this.contractor=contractor;
		count++;
	}
	
	

	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public Contractor getContractor() {
		return contractor;
	}
	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}
	
}

