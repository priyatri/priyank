package com.capgemini.beans;
import java.util.ArrayList;
import java.util.Date;
public class Employee
{
	int id;
	String fname;
	String lname;
	int salary;
	static int c=1;
	public Employee( String fname, String lname, int salary) {
		this.id = c;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		c=c+1;
	}
	public Employee()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
