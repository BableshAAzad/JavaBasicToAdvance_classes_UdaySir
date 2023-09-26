package EmployeeComparator;
import java.util.Comparator;
import java.util.TreeSet;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee id of " + name + " is " + id;
	}
}

class SortName implements Comparator<Employee> {
	@Override
	public int compare(Employee x, Employee y) {
		return x.name.compareTo(y.name); // y.name - x.name for desending order
//		for String comparision, we cannot use '-', use compareTo of String class
	}
}

class SortId implements Comparator<Employee> {
	@Override
	public int compare(Employee x, Employee y) {
		return x.id - y.id; // y.id - x.id for desending order
	}
}

// x --> current object to be inserted 
// y --> already existing object

public class EmployeeSolutionC {
	public static void main(String[] args) {
		Employee emp1 = new Employee(200, "Bablesh");
		Employee emp2 = new Employee(100, "Kumar");
		Employee emp3 = new Employee(300, "AAzad");

		SortName sn = new SortName();
		SortId si = new SortId();
		TreeSet<Employee> t = new TreeSet<Employee>(sn);
		t.add(emp1);
		t.add(emp2);
		t.add(emp3);
		for (Employee e : t) {
			System.out.println(e);
		}
	}
}

