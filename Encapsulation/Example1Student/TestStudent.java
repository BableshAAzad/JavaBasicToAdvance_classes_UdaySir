package Encapsulation.Example1Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(23);
        int age = s1.getAge();
        System.out.println("Age : " + age);
        System.out.println("Age : " + s1.getAge());
    }
}
