public class EmployeeList {
    private Integer id;
    private String name;
    private Double salary;

    EmployeeList(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id : " + id + " Name : " + name + " Salary : " + salary;
    }

    @Override
    public int hashCode() {
        return this.getId();
    }

    @Override
    public boolean equals(Object obj) {
        return this.getSalary() == ((EmployeeList) obj).getSalary();
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
