package bean;

public class Employee
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
	public int hashCode() 
	{
	   return id;	
	}
	
	@Override
	public boolean equals(Object obj) 
	{
	  return this.hashCode() == obj.hashCode();	
	}
	
	@Override
	public String toString() 
	{
	  String empDetials = id +" "+name+" "+job+" "+sal;
	  return empDetials;
	}
}


