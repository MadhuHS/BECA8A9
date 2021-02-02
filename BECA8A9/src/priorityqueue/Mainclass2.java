package priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

import bean.Employee;

/*
 * 
 */

class EmpIDSort implements Comparator<Employee>
{
	@Override
	public int compare (Employee emp1,Employee emp2)
    {
       return emp2.getId() - emp1.getId();
    };	
}

public class Mainclass2 
{
	static PriorityQueue<Employee> elist;
	public static void createTreeSetData(String order) 
	{
		/*creates the TreeSet and sort the Employee object according ID
		  in Asc order
		*/
		if(order.equalsIgnoreCase("asc"))
		{
          elist = new PriorityQueue<Employee>();//treeset depends on CompareTo() of Comparable
		}
		
		/*creates the TreeSet and sort the Employee object according ID
		  in Desc order defined in lambda function
		*/
		else
		{
	      Comparator<Employee> cmp = 
	    		  (Employee emp1,Employee emp2)->
	               {
	    	        return emp2.getId() - emp1.getId();
	    	        //return (int) (emp2.getSal() - emp1.getSal());
	               };
	    	
	               EmpIDSort es1 = new EmpIDSort();
		  elist = new PriorityQueue<Employee>(es1);//treeset depends on Compare() of Comparator	
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
		while(elist.isEmpty() == false)
		{
			System.out.println(elist.poll());
		}
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



