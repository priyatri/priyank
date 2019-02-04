
package shubham;
public class Employee1
{



long ID;
	String fname;
	String lname;
	double salary;
	int grade;
	String doj;
	public char[] getDate;
	static int id=0;
	public Employee1( String fname, String lname, double salary, int grade, String doj) 
	{
	id=id+1;
		this.ID=id;
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
		this.grade = grade;
		this.doj = doj;
	}

	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id=id;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Employee1.id = id;
	}
	
	public char[] getDate()
	{
		return null;
	}
	}




