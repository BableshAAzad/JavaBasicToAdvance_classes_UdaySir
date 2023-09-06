package org;

public class Studentent {
    void display(int id) {
        System.out.println("Id : " + id);
    }

    void display(double weight) {
        System.out.println("Weight : " + weight);
    }

    void display(int age, int fee) {
        System.out.println("Age : " + age + " Fee : " + fee);
    }

    void display(String name, String dob) {
        System.out.println("Name : " + name + " DOB : " + dob);
    }

    public static void main(String[] args) {
        Studentent st = new Studentent();
        st.display("Bablesh AAzad", "20-JUN-1995");
        st.display(28, 50000);
        st.display(71.05);
        st.display(101);
    }
}
