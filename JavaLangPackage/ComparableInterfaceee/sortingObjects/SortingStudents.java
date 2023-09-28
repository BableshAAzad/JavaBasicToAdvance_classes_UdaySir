package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class SortingStudents {
    public static void main(String[] args) {
        StudentSort ss1 = new StudentSort(34, "Ashwani", 5.4);
        StudentSort ss2 = new StudentSort(21, "Bablesh", 5.7);
        StudentSort ss3 = new StudentSort(32, "Kajol", 5.5);
        StudentSort ss4 = new StudentSort(30, "Durgesh", 5.8);

        TreeSet<StudentSort> t = new TreeSet<StudentSort>();
        t.add(ss1);
        t.add(ss2);
        t.add(ss3);
        t.add(ss4);
        Iterator<StudentSort> i = t.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("------------------------------------------");
        ArrayList<StudentSort> al = new ArrayList<StudentSort>();
        al.add(ss1);
        al.add(ss2);
        al.add(ss3);
        al.add(ss4);
        Collections.sort(al);
        for (StudentSort sors : al) {
            System.out.println(sors);
        }
    }
    /**
     * Note : We can sort objects using the following ways : 
     *     1. TreeSet
     *     2. Any List (Arraylist, LinkedList, Stack, Vector) & Collections.sort();
     *     3. TreeMap (If Objects are keys)
     * 
     * Note : If Objects are not comparable in nature : 
     *      1. TreeSet & TreeMap -> ClassCastException
     *      2.Collections.sort() -> Compilation Error
     */
}
