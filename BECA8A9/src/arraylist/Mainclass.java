package arraylist;

import java.util.ArrayList;

import bean.Employee;

public class Mainclass {

	static ArrayList<Employee> elist;

	public static void createArrayListData() {
		elist = new ArrayList<Employee>();

		Employee e1 = new Employee(1, "Smith", "Dev", 2341.2);
		Employee e2 = new Employee(2, "Blake", "Sales", 1212.1);
		Employee e3 = new Employee(3, "Martin", "QA", 1000);
		Employee e4 = new Employee(4, "Miller", "DEV", 2114.1);
		Employee e5 = new Employee(5, "Blake", "HR", 1311.1);

		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
	}

	public static void getEmployees() 
	{
		for (int index = 0; index <= elist.size() - 1; index++) 
		{
			System.out.println(elist.get(index).toString());
		}

	}

	public static void main(String[] args) {
		createArrayListData();
		getEmployees();
	}

}
