package com.capgemini.beans;

public class test {

	public static void main(String[] args) {
		
		
		
		Date d= new Date(26,02,2018);
		Contractor c= new Contractor("Priyam",8.0);
		
		Contract_Based_Employee ob1= new Contract_Based_Employee("Priya","Singh",0.0,d,7,c);
		System.out.println(ob1.getFName());
		System.out.println(ob1.getSalary());
		System.out.println(ob1.contractor.getName());
		System.out.println(ob1.doj.display());
		
		Permanent_Employee ob2= new Permanent_Employee("Shivi","Singh",25000.0,d);
        System.out.println(ob2.getFName());
		System.out.println(ob2.getSalary());
		System.out.println(ob2.doj.display());
		
	}
	
	
	
	
}
