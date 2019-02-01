package com.capgemini.beans;

public class Project_Manager extends Permanent_Employee  {
	public Project_Manager(String fname, String lname, double salary, Date doj)
	{
		super(fname, lname,salary,doj);
	}
	public Mediclaim getClaimref() {
		Mediclaim claimref=new Mediclaim(this.getSalary());
		return claimref ;
	}
	
}


