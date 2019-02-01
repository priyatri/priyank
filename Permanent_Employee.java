package com.capgemini.beans;

public abstract class Permanent_Employee extends Employee {
	
	Mediclaim claimref;
	
	public Permanent_Employee(String fname, String lname, double salary, Date doj) {
		super(fname, lname, salary,doj);
		
		
	}

	public Mediclaim getClaimref() {
		return claimref;
	}

	

}