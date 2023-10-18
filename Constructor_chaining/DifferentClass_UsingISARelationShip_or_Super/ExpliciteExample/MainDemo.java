class Person {
    int id;
    Person(int id) {
        this.id = id;
    }
}

class Employee extends Person {
    int age;
    String name;

    Employee(int age, String name, int id) {
        super(id);
        this.age = age;
        this.name = name;
    }
}

public class MainDemo {
    public static void main(String[] args) {
        Employee e = new Employee(22, "Bablesh", 100);
		System.out.println("Name: " + e.name + ", Age: " + e.age + ", Id: " + e.id);
		
		Employee ee = new Employee(23, "AAzad", 101);
		System.out.println("Name: " + ee.name + ", Age: " + ee.age + ", Id: " + ee.id);
    }
}
