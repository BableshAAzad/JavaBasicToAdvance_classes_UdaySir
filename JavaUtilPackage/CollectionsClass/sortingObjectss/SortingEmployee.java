package sortingObjectss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class SortingEmployee {
    public static void main(String[] args) {
        SortEmployeeById sid = new SortEmployeeById();
        TreeSet<EmployeeSort> ts = new TreeSet<EmployeeSort>(sid);
        ts.add(new EmployeeSort(300, "Kajol", 4.2));
        ts.add(new EmployeeSort(100, "Lalita", 5.8));
        ts.add(new EmployeeSort(700, "Bablesh", 7.3));
        ts.add(new EmployeeSort(400, "Durgesh", 8.3));
        ts.add(new EmployeeSort(500, "Ashwani", 6.4));
        Iterator<EmployeeSort> i = ts.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("---------------------------------------");

        ArrayList<EmployeeSort> al = new ArrayList<EmployeeSort>();
        al.add(new EmployeeSort(300, "Kajol", 4.2));
        al.add(new EmployeeSort(100, "Lalita", 5.8));
        al.add(new EmployeeSort(700, "Bablesh", 7.3));
        al.add(new EmployeeSort(400, "Durgesh", 8.3));
        al.add(new EmployeeSort(500, "Ashwani", 6.4));
        Collections.sort(al, new SortEmployeeByName());
        Iterator<EmployeeSort> j = al.iterator();
        while (j.hasNext()) {
            System.out.println(j.next());
        }

        System.out.println("---------------------------------------");

        EmployeeSort es1 = new EmployeeSort(300, "Kajol", 4.2);
        EmployeeSort es2 = new EmployeeSort(100, "Lllita", 5.8);
        EmployeeSort es3 = new EmployeeSort(700, "Bablesh", 7.3);
        EmployeeSort es4 = new EmployeeSort(400, "Durgesh", 8.3);
        EmployeeSort es5 = new EmployeeSort(500, "Ashwani", 6.4);
        LinkedList<EmployeeSort> ll = new LinkedList<EmployeeSort>();
        ll.add(es1);
        ll.add(es2);
        ll.add(es3);
        ll.add(es4);
        ll.add(es5);
        SortEmployeeBySalary ssalary = new SortEmployeeBySalary();
        Collections.sort(ll, ssalary);
        for (EmployeeSort emp : ll) {
            System.out.println(emp);
        }
    }
}
