package com.cg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServices;

public class Services implements EmployeeServices 
{
Employee e;

@Override
public Employee setDetails() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the employee's name");
	String name=s.next();
	System.out.println("Enter the employee's id");
	int id=s.nextInt();
	System.out.println("Enter the employee's salary");
	int salary=s.nextInt();
	System.out.println("Enter the employee's designation");
	String designation=s.next();
	System.out.println("Enter the insurance scheme");
	String insurancescheme=s.next();
	 e=new Employee(id,name,salary,designation,insurancescheme);
	return e;
	
	
}

@Override
public void insurancescheme(int salary, String designation, Employee e) {
if(designation.equals("System Associate")&&(salary>5000 && salary<20000)
		a.setInsurancescheme("A");
}
else if(designation.equals)
	
}

@Override
public void getDetails() {
	// TODO Auto-generated method stub
	
}

}
