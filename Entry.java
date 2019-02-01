package com.capgemini.beans;

public class Entry {
	public static void main(String[] args)
	{
		Date d= new Date(26,06,2018);
		Contractor p= new Contractor("abc",7.0);
		
	/*	Contract_Based_Employee ob1= new Contract_Based_Employee("Priya","Singh",0.0,d,7,c);
		System.out.println(ob1.getFName());
		System.out.println(ob1.getSalary());
		System.out.println(ob1.contractor.getName());
		System.out.println(ob1.doj.display());
		
		Permanent_Employee ob2= new Permanent_Employee("Shivi","Sinha",25000.0,d);
        System.out.println(ob2.getFName());
		System.out.println(ob2.getSalary());
		System.out.println(ob2.doj.display());
		*/
		Date l= new Date(26,06,2018);
				Project_Manager ob3= new Project_Manager("Rishi","Raj", 34000.0,l);
				System.out.println(ob3.getFName());
				System.out.println(ob3.getLName());
				System.out.println(ob3.getSalary());
				System.out.println(ob3.doj.display());
			   System.out.println(ob3.getClaimref().getCoverageammount());
				
				Date g= new Date(26,06,2018);
				Technical_Associate ob4=new Technical_Associate("Preeti","Sharma",45000.0,g);
				System.out.println(ob4.getFName());
				System.out.println(ob4.getLName());
				System.out.println(ob4.getSalary());
				System.out.println(ob4.doj.display());
				System.out.println(ob4.getClaimref().getCoverageammount());
	}
	
	
	
	
	
}
