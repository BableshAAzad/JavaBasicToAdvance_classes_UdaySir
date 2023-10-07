import java.util.ArrayList;
import java.util.Collections;

class Employeee {
  int id;
  Double salary;
  String name;

  Employeee(int id, double salary, String name) {
    this.id = id;
    this.salary = salary;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Name : " + name + ", Id : " + id + ", Salary : " + salary;
  }
}

public class MainEmployeeeClass {
  public static void main(String[] args) {
    Employeee e1 = new Employeee(4, 8.3, "Laita");
    Employeee e2 = new Employeee(2, 2.4, "Bablu");
    Employeee e3 = new Employeee(5, 3.5, "Kajol");
    Employeee e4 = new Employeee(3, 7.1, "Rajaj");
    Employeee e5 = new Employeee(1, 2.9, "Daddu");
    ArrayList<Employeee> e = new ArrayList<Employeee>();
    e.add(e1);
    e.add(e2);
    e.add(e3);
    e.add(e4);
    e.add(e5);
    EmployeeeSortBySalary sid = new EmployeeeSortBySalary();
    Collections.sort(e, sid);
    System.out.println("Highest Salary of : " + e.get(e.size() - 1));
    System.out.println("Lowest Salary of : " + (e.get(0)));
    for (Employeee employeee : e) {
      if (employeee.salary >= 2.5 && employeee.salary <= 3.5) {
        System.out.println("Name : " + employeee.name + ", Salary : " + employeee.salary);
      }
    }
  }
  /**
   * Output : 
   * Highest Salary of : Name : Laita, Id : 4, Salary : 8.3
   * Lowest Salary of : Name : Bablu, Id : 2, Salary : 2.4
   * 
   * Name of Person which salary is within 2.5 to 3.5 -->
   * Name : Daddu, Salary : 2.9
   * Name : Kajol, Salary : 3.5
   */
}
