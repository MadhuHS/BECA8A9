package hashset;

import java.util.HashSet;

import bean.Employee;

/*
 * Assuming the database returns duplicate records of Employee.

  write a function that display All employee data without duplicates
 */
public class Mainclass2 
{
	static HashSet<Employee> elist;
	public static void createHashSetData() 
	{
        elist = new HashSet<Employee>();
		Employee e1 = new Employee(1, "Smith", "Dev", 2341.2);
		Employee e2 = new Employee(2, "Blake", "Sales", 1212.1);
		Employee e3 = new Employee(3, "Martin", "QA", 1000);
		Employee e6 = new Employee(1, "Smith", "Dev", 2341.2);
		Employee e4 = new Employee(4, "Miller", "DEV", 2114.1);
		Employee e5 = new Employee(5, "Blake", "HR", 1311.1);
		Employee e7 = new Employee(3, "Martin", "QA", 1000);
		
		elist.add(e1);
		elist.add(e2);//-->add()--->e1.equals(e2)-->e1.hashcode() == e2.hashcode();
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		elist.add(e6);
		elist.add(e7);
	}

	public static void getEmployees() 
	{
		elist.stream()
		     .forEach(emp -> System.out.println(emp));
	}

	public static void main(String[] args) {
		createHashSetData();
		getEmployees();
	}
}



