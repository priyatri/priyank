package lab2;

public class Employee2 {

		long ID;
		String name1;
		String name2;
		int salary;
		int grade;
		String joining;
		 static int empn=0;
		
	public char[] getDate;
	static int id=0;
	public Employee2(String name1, String name2, int salary, int grade, String joining)
	
	{
		super();
	empn=empn+1;
	this.ID=id;
	this.name1=name1;
	this.name2=name2;
	this.salary=salary;
	this.grade=grade;
	this.joining=joining;
			}

	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getJoining() {
		return joining;
	}
	public void setJoining(String joining) {
		this.joining = joining;
	}
	
	public int getEmpn() {
		return empn;
	}
	public void setEmpn(int empn) {
		this.empn = empn;}
	
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Employee2.id = id;
	}
	public char[] getDate()
	{
		return null;
	}
	
	}
	
	
	