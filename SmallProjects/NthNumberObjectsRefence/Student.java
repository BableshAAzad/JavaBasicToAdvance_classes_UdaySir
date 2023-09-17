package NthNumberObjectsRefence;

import java.util.Scanner;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        Student[] s = new Student[n];
        // System.out.println("Enter reference numbers : ");
        for (int i = 0; i < s.length; i++) {
            System.out.println("Enter name and Id : ");
            String name = sc.next();
            int id = sc.nextInt();
            s[i] = new Student(name, id);
        }
        System.out.println("Student name and id is : ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].name + " " + s[i].id);
        }
        sc.close();
    }
}