// package Constructor_chaining.SameClass_UsingThis;

public class Student {
    Student(int age) {
        this(5.6);
        System.out.println("Age : " + age);
    }

    Student(String name) {
        System.out.println("Name : " + name);
    }

    Student(double height) {
        this("Tom");
        System.out.println("Height : " + height);
    }

    public static void main(String[] args) {
        Student s = new Student(20);
    }
}
