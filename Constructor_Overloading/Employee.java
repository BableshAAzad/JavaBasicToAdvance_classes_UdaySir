package Constructor_Overloading;

class Employee {
    Employee() {
        System.out.println("Non-parameterized constructor");
    }

    Employee(int id) {
        System.out.println("Id : " + id);
    }

    Employee(double sal) {
        System.out.println("Salary : " + sal);
    }

    Employee(int age, String name) {
        System.out.println("Age : " + age + " Name : " + name);
    }

    Employee(String email, int password) {
        System.out.println("Email : " + email + " Password : " + password);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(3.8);
        new Employee();
        new Employee(22, "AAzad");
        new Employee("abablesh@gmail.com", 12345);
        Employee e2 = new Employee(100);
    }
}