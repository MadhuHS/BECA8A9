package treeset;

import java.util.Comparator;
import java.util.TreeSet;

import bean.Employee;

/*
 * 
 */
public class Mainclass2 
{
	static TreeSet<Employee> elist;
	public static void createTreeSetData(String order) 
	{
		if(order.equalsIgnoreCase("asc"))
		{
          elist = new TreeSet<Employee>();//treeset depends on CompareTo() of Comparable
		}
		else
		{
	      Comparator<Employee> cmp = (Employee emp1,Employee emp2)->
	      {
	    	   return emp2.getId() - emp1.getId();
	    	  //return (int) (emp2.getSal() - emp1.getSal());
	      };
	    		  
		  elist = new TreeSet<Employee>(cmp);//treeset depends on Compare() of Comparator	
		}
        
        
		Employee e1 = new Employee(1, "Smith", "Dev", 2341.2);
		Employee e3 = new Employee(3, "Martin", "QA", 1000);
		Employee e4 = new Employee(4, "Miller", "DEV", 2114.1);
		Employee e5 = new Employee(5, "Blake", "HR", 1311.1);
		Employee e7 = new Employee(3, "Martin", "QA", 1000);
		Employee e2 = new Employee(2, "Blake", "Sales", 1212.1);
		Employee e6 = new Employee(1, "Smith", "Dev", 2341.2);


		elist.add(e3);
		elist.add(e1);
		elist.add(e2);//-->add()--->compareTo()
		elist.add(e5);
		elist.add(e6);
		elist.add(e7);
		elist.add(e4);

		
		System.out.println("data added to TreeSet");
	}
	
	public static void getEmployees()
	{
		elist.stream()
		     .forEach(emp -> System.out.println(emp));
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
		createTreeSetData("desc");
		getEmployees();
		
		createTreeSetData("asc");
		getEmployees();
		System.out.println("Program ends...");
	}
}



