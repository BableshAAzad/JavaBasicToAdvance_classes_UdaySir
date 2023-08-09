package Constructor_chaining.SameClass_UsingThis;

class Employee {
    Employee(int id) {
        System.out.println("ID : " + id);
    }

    Employee(double salary) {
        this(25, "AAzad");
        System.out.println("Salary : " + salary);
    }

    Employee(int age, String name) {
        this(100);
        System.out.println("Age : " + age + " Name : " + name);
    }

    public static void main(String[] args) {
        Employee e = new Employee(2.6);
    }
}
