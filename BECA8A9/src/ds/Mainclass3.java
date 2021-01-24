package ds;

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
}

public class Mainclass3 
{
	public static void main(String[] args) 
	{
       Employee e1 = new Employee(1,"Smith","Dev",2341.2);
       
       Employee[] elist = new Employee[10];
	}
}








