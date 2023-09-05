// package Constructor_chaining.SameClass_UsingThis;

class EmployeeCC {
    EmployeeCC(int id) {
        System.out.println("ID : " + id);
    }

    EmployeeCC(double salary) {
        this(25, "AAzad");
        System.out.println("Salary : " + salary);
    }

    EmployeeCC(int age, String name) {
        this(100);
        System.out.println("Age : " + age + " Name : " + name);
    }

    public static void main(String[] args) {
        EmployeeCC e = new EmployeeCC(2.6);
    }
}
