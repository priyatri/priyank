package shubham;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class test1 {
	public static void main(String[]args) throws ParseException
	{
		Employee1 ob1= new Employee1("Priyam","Tripathi",890000.0,2,"03/09/2018");
		SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat d1=new SimpleDateFormat("dd-MM-yyyy");
		String a1=ob1.getDoj();
		Date date=d.parse(a1);
		String a2=d1.format(date);
		System.out.println(ob1.getFname());
		System.out.println(ob1.getLname());
		System.out.println(ob1.getSalary());
	System.out.println(ob1.getGrade());
	System.out.println(a2);

}
}
