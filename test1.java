package lab2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class test1
{
	public static void main(String[] args) throws ParseException
	{
		Employee2 ob1=new Employee2("priyam","tripathi",45673,567,"04/12/2018");
		SimpleDateFormat d= new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat d1= new SimpleDateFormat("dd-MM-yyyy");
		String ad= ob1.getJoining();
		Date date= d.parse(ad);
		String add=d1.format(date);
		System.out.println(ob1.getName1());
		System.out.println(ob1.getName2());
		
		System.out.println(ob1.getSalary());
		
		System.out.println(ob1.getGrade());
		System.out.println(ob1.getEmpn());
		
		System.out.println(add);
		Employee2 ob2=new Employee2("ayushi","srivastava",23456,789,"06/04/2021");
		SimpleDateFormat d2= new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat d3= new SimpleDateFormat("dd-MM-yyyy");
		String ab= ob2.getJoining();
		Date dat= d2.parse(ab);
		String ade=d3.format(dat);
		
	System.out.println(ob2.getName1());
	System.out.println(ob2.getName2());
	
	System.out.println(ob2.getSalary());
	
	System.out.println(ob2.getGrade());
	System.out.println(ob2.getEmpn());
	
	System.out.println(add);
	}
}                                                                                                           
		
