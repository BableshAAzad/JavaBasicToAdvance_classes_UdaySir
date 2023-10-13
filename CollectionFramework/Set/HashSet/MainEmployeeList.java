import java.util.*;

public class MainEmployeeList {
    public static void main(String[] args) {
        EmployeeList e1 = new EmployeeList(101, "Babblesh", 3.4);
        EmployeeList e2 = new EmployeeList(102, "Kajol", 4.6);
        EmployeeList e3 = new EmployeeList(103, "Durgesh", 8.4);
        EmployeeList e4 = new EmployeeList(104, "Lalita", 3.2);
        EmployeeList e5 = new EmployeeList(105, "Ashwani", 5.4);
        HashSet<EmployeeList> hs = new HashSet<EmployeeList>();
        hs.add(e1);
        hs.add(e1); // Not Allow dublicate, This line not inserted
        hs.add(e1); // Not Allow dublicate, This line not inserted
        hs.add(e2);
        hs.add(e3);
        hs.add(e4);
        hs.add(e5);
        for (EmployeeList emp : hs) {
            System.out.println(emp);
        }
        System.out.println("\nSorting According ID : \n");
        EmployeeListComparator c = new EmployeeListComparator();
        TreeSet<EmployeeList> ts = new TreeSet<EmployeeList>(c);
        ts.add(e1);
        ts.add(e1); // Not Allow dublicate, This line not inserted
        ts.add(e6);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        for (EmployeeList empT : ts) {
            System.out.println(empT);
        }
    }
    /**
     * Output :
     * 
     * Id : 101 Name : Babblesh Salary : 3.4
     * Id : 102 Name : Kajol Salary : 4.6
     * Id : 103 Name : Durgesh Salary : 8.4
     * Id : 104 Name : Lalita Salary : 3.2
     * Id : 105 Name : Ashwani Salary : 5.4
     * 
     * Sorting According ID :
     * 
     * Id : 101 Name : Babblesh Salary : 3.4
     * Id : 101 Name : Babblesh Salary : 3.4
     * Id : 102 Name : Kajol Salary : 4.6
     * Id : 103 Name : Durgesh Salary : 8.4
     * Id : 104 Name : Lalita Salary : 3.2
     * Id : 105 Name : Ashwani Salary : 5.4
     * Id : 105 Name : Ashwani Salary : 5.4
     */
}
