import java.util.*;

class EmployeeT implements Comparable<EmployeeT> {
    int id;

    EmployeeT(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id : " + id;
    }

    @Override
    public int compareTo(EmployeeT t) {
        return this.id - t.id;
    }
}

public class TreeEmployee {
    public static void main(String[] args) {
        EmployeeT t1 = new EmployeeT(30);
        EmployeeT t2 = new EmployeeT(10);
        EmployeeT t3 = new EmployeeT(40);
        EmployeeT t4 = new EmployeeT(20);
        EmployeeT t5 = new EmployeeT(25);
        EmployeeT t6 = new EmployeeT(17);
        EmployeeT t7 = new EmployeeT(31);
        TreeSet<EmployeeT> ts = new TreeSet<>();
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        ts.add(t5);
        ts.add(t6);
        ts.add(t7);
        for (EmployeeT i : ts) {
            System.out.println(i);
        }
    }
}
