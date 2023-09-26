package EmployeeComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class DemoComparator {
    int age;

    DemoComparator(int age) {
        this.age = age;
    }

    public String toString() {
        return "Age : " + age;
    }
}

class Democom implements Comparator<DemoComparator> {
    @Override
    public int compare(DemoComparator x, DemoComparator y) {
        return x.age - y.age;
    }
}

public class MainDemoComparator {
    public static void main(String[] args) {
        DemoComparator dc1 = new DemoComparator(34);
        DemoComparator dc2 = new DemoComparator(50);
        DemoComparator dc3 = new DemoComparator(35);
        DemoComparator dc4 = new DemoComparator(25);
        Democom dd = new Democom();
        TreeSet<DemoComparator> al = new TreeSet<DemoComparator>(dd);
        al.add(dc1);
        al.add(dc2);
        al.add(dc3);
        al.add(dc4);
        System.out.println(al);
    }
}
