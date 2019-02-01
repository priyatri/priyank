package com.capgemini.beans;

public class Technical_Associate extends Permanent_Employee {
	
	public Technical_Associate(String fname, String lname, double Salary, Date doj)
	{
		super(fname, lname, Salary, doj);
	
	}
	public Mediclaim getClaimref() {
		Mediclaim claimref=new Mediclaim(this.getSalary()*2);
		return claimref ;
	}
		

	
	}
