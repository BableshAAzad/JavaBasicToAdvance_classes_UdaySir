package sortingObjectss;

public class EmployeeSort {
    int id;
    String name;
    Double salary; // Wrapper class declaration to call compareTo() later

    EmployeeSort(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", Name : " + name + ", Salary : " + salary;
    }
}
