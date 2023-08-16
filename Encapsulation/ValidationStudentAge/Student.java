package Encapsulation.ValidationStudentAge;

public class Student {
    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
            System.out.println("Age initialized");
        } else
            System.out.println("Invalid age");
    }
    public int getAge(){
        return age;
    }

}
