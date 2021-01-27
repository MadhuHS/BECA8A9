package hashmap;

import java.util.HashMap;

import bean.Employee;

public class Mainclass {

	static HashMap<Integer, Employee> eMap;

	public static void createData() {
		eMap = new HashMap<Integer, Employee>();

		Employee e1 = new Employee(1, "Smith", "Dev", 2341.2);
		Employee e2 = new Employee(2, "Blake", "Sales", 1212.1);
		Employee e3 = new Employee(3, "Martin", "QA", 1000);
		Employee e4 = new Employee(4, "Miller", "DEV", 2114.1);
		Employee e5 = new Employee(5, "Blake", "HR", 1311.1);

		// size() : no. of elements in collection
		System.out.println(eMap.size());

		eMap.put(e1.getId(), e1);
		eMap.put(e2.getId(), e2);
		eMap.put(e3.getId(), e3);
		eMap.put(e4.getId(), e4);
		eMap.put(e5.getId(), e5);

		System.out.println(eMap.size());
	}

	public static Employee getEmpById(int id) {
		Employee e1 = eMap.get(id);
		return e1;
	}

	public static void updateSal(int id, double newSal) {
		Employee e1 = eMap.get(id);
		e1.setSal(newSal);

	}

	public static void main(String[] args) {
		Employee emp = getEmpById(2);
		System.out.println(emp.toString());

		updateSal(2, 2000);

		emp = getEmpById(2);
		System.out.println(emp.toString());
	}

}
