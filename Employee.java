package com.capgemini.beans;
public class Employee {

	String fname;
	String lname;
	double salary;
	Date doj;
	static int empn=0;

private int id;
public Employee(String fname, String lname, double salary, Date doj)

{

empn=empn+1;
this.id=empn;
this.fname=fname;
this.lname=lname;
this.salary=salary;
this.doj=doj;

}

public int getID() {
	return id;
}
public void setID(int id) {
	this.id = id;
}

public String getFName() {
	return fname;
}
public void setFName(String fname) {
	this.fname = fname;
}

public String getLName() {
	return lname;
}
public void setLName(String lname) {
	this.lname = lname;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

public Date getDoj() {
	return doj;
}

public void setDoj(Date doj) {
	this.doj = doj;
}
}
