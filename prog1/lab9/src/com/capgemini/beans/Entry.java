package com.capgemini.beans;
import java.util.Scanner;

public class Entry {
	static Employee[] emp1=new Employee[5];
	private static Scanner sc;
	public static void main(String[] args)
	{
		emp1[0]=new Employee("priya","singh",50000);
		emp1[1]=new Employee("priyam","tripathi",90000);
		emp1[2]=new Employee("akhilesh","srivastava",60000);
		emp1[3]=new Employee("himanshu","kaushik",80000);
		emp1[4]=new Employee("saurabh","mishra",30000);
		System.out.println("input id to find");
		sc=new Scanner(System.in);
		int a=sc.nextInt();
		boolean flag= search(a);
		System.out.println(flag);
		if(flag==false)
			try
		{
				throw new MyException();
		} catch (MyException e){
			System.out.println("good day");
		}
		}
		private static boolean search(int id)
		{
			int i;
			for(i=0;i<5;i++)
			{
				int y= emp1[i].getId();
				if(y==id){
					System.out.println("employee found");
					System.out.println(emp1[i].getFname());
					return true;
				}
				
			}
			return false;

	}

}
