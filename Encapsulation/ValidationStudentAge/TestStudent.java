package Encapsulation.ValidationStudentAge;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter age : ");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("Age : " + s.getAge());
    }
}
