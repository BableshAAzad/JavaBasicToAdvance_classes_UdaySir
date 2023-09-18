import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
       TreeSet ts = new TreeSet();
       ts.add(40);
       ts.add(10);
       ts.add(70);
       ts.add(30);
       ts.add(25);
       ts.add(45);
       ts.add(15);
       ts.add(30);
       System.out.println(ts);
       TreeSet ts1 = new TreeSet();
       ts1.add(30);
       ts1.add(40);
       ts1.add(20);
       ts1.add(30);
       ts1.add(50);
       ts1.add(10);
       System.out.println(ts1);
    }
}
