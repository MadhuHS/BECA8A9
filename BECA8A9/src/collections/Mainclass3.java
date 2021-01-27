package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

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
	static HashMap<Integer, Employee> eMap;
	static  ArrayList<Employee> elist;
	
	public static void createData()
	{
		 eMap = new  HashMap<Integer, Employee>(); 
	       
	       Employee e1 = new Employee(1,"Smith","Dev",2341.2);
	       Employee e2 = new Employee(2,"Blake","Sales",1212.1);
	       Employee e3 = new Employee(3,"Martin","QA",1000);
	       Employee e4 = new Employee(4,"Miller","DEV",2114.1);
	       Employee e5 = new Employee(5,"Blake","HR",1311.1);
	       
	       //size() : no. of elements in collection
	       System.out.println(eMap.size());
	       
	       eMap.put(e1.getId(),e1);
	       eMap.put(e2.getId(),e2);
	       eMap.put(e3.getId(),e3);
	       eMap.put(e4.getId(),e4);
	       eMap.put(e5.getId(),e5);
	       
	       System.out.println(eMap.size());
	}
	
	public static void createArrayListData()
	{
		   elist = new ArrayList<Employee>();
		   
	       Employee e1 = new Employee(1,"Smith","Dev",2341.2);
	       Employee e2 = new Employee(2,"Blake","Sales",1212.1);
	       Employee e3 = new Employee(3,"Martin","QA",1000);
	       Employee e4 = new Employee(4,"Miller","DEV",2114.1);
	       Employee e5 = new Employee(5,"Blake","HR",1311.1);
	       
	       elist.add(e1);
	       elist.add(e2);
	       elist.add(e3);
	       elist.add(e4);
	       elist.add(e5);
	}
	
	public static Employee getEmpById(int id)
	{
		  Employee e1 = eMap.get(id);
		  return e1;
	}
	
	public static void updateSal(int id,double newSal)
	{
		  Employee e1 = eMap.get(id);
		  e1.setSal(newSal);
		  
	}
	
	public static void getEmployees()
	{	 
		 for(int index=0; index<=elist.size()-1;index++)
		 {
	       System.out.println(elist.get(index).toString());
		 }
		 
		 
	}
	
	
}

public class Mainclass3 
{
	public static void main(String[] args) 
	{    
	  /* HashMap
	   * EmpService.createData();
	   
       Employee emp =  EmpService.getEmpById(2);
       System.out.println(emp.toString());
       
       EmpService.updateSal(2,2000);
      
       emp =  EmpService.getEmpById(2);
       System.out.println(emp.toString());
      */
		
		
       EmpService.createArrayListData();
       EmpService.getEmployees();
       
	}
}








