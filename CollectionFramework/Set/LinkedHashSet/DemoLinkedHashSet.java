import java.util.*;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        EmployeeSal es1 = new EmployeeSal(5);
        EmployeeSal es2 = new EmployeeSal(2);
        EmployeeSal es3 = new EmployeeSal(3);
        EmployeeSal es4 = new EmployeeSal(4);
        EmployeeSal es5 = new EmployeeSal(7);

        LinkedHashSet<EmployeeSal> lhs = new LinkedHashSet<EmployeeSal>();
        lhs.add(es1);
        lhs.add(es2);
        lhs.add(es3);
        lhs.add(es4);
        lhs.add(es5);
        lhs.add(es5);

        System.out.println("Using LinkedHashSet : ");
        for (EmployeeSal emp : lhs) {
            System.out.println(emp);
        }
        System.out.println("-------------------------------");
        TreeSet<EmployeeSal> ts = new TreeSet<EmployeeSal>();
        ts.addAll(lhs);
        for (EmployeeSal e : ts) {
            System.out.println(e);
        }
    }
}
