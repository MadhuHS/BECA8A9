package ds;

import java.util.Arrays;

//OBJECT ARRAY

//Entity,Bean
class Employee
{
	private int id;
	private String name;
	private String job;
	private double sal;
	
	public Employee()
	{
		
	}
	
	public Employee(int id, String name, String job, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() 
	{
	  String empDetials = id +" "+name+" "+job+" "+sal;
	  return empDetials;
	}
}

class EmpService
{
	public static void displayAllEmps(Employee[] elist)
	{
	  //select * from emp;
	  for (int i = 0; i < elist.length; i++) 
	  {
		 System.out.println(elist[i].toString());
	  }
	}
}

class EmpServiceImpStream
{
	public static void displayAllEmps(Employee[] elist)
	{
	  Arrays.stream(elist)
	        .forEach(emp -> System.out.println(emp.toString()));
	}
}
public class Mainclass3 
{
	public static void main(String[] args) 
	{       
       Employee[] elist = new Employee[5];
       
       elist[0] = new Employee(1,"Smith","Dev",2341.2);
       elist[1] = new Employee(2,"Blake","Sales",1212.1);
       elist[2] = new Employee(3,"Martin","QA",1000);
       elist[3] = new Employee(4,"Miller","DEV",2114.1);
       elist[4] = new Employee(5,"Blake","HR",1311.1);
       
       EmpService.displayAllEmps(elist);
       EmpServiceImpStream.displayAllEmps(elist);
	}
}








