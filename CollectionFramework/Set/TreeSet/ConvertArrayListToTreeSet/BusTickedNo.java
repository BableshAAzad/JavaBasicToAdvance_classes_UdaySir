package ConvertArrayListToTreeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class BusTickedNo {
    Integer id;
    Double price;
    String name;

    BusTickedNo(Integer id, Double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id : " + id + ", Name : " + name + ", Price : " + price;
    }

    public static void main(String[] args) {
        BusTickedNo tNo1 = new BusTickedNo(5, 43.2, "Bablesh");
        BusTickedNo tNo2 = new BusTickedNo(3, 10.4, "Kumar");
        BusTickedNo tNo3 = new BusTickedNo(4, 32.4, "Durgesh");
        BusTickedNo tNo4 = new BusTickedNo(1, 19.8, "Kajol");
        BusTickedNo tNo5 = new BusTickedNo(2, 59.3, "Kinley");
        ArrayList<BusTickedNo> al = new ArrayList<BusTickedNo>();
        al.add(tNo1);
        al.add(tNo2);
        al.add(tNo3);
        al.add(tNo4);
        al.add(tNo5);
        System.out.println("Print Using ArrayList : ");
        al.forEach(System.out::println);
        Comparator<BusTickedNo> c = (x, y) -> x.id.compareTo(y.id);
        TreeSet<BusTickedNo> ts = new TreeSet<BusTickedNo>(c);
        ts.addAll(al);
        System.out.println("\nSort id Usint Comprator and TreeSet : ");
        ts.forEach(System.out::println);
    }
    /**
     * Print Using ArrayList :
     * Id : 5, Name : Bablesh, Price : 43.2
     * Id : 3, Name : Kumar, Price : 10.4
     * Id : 4, Name : Durgesh, Price : 32.4
     * Id : 1, Name : Kajol, Price : 19.8
     * Id : 2, Name : Kinley, Price : 59.3
     * 
     * Sort id Usint Comprator and TreeSet :
     * Id : 1, Name : Kajol, Price : 19.8
     * Id : 2, Name : Kinley, Price : 59.3
     * Id : 3, Name : Kumar, Price : 10.4
     * Id : 4, Name : Durgesh, Price : 32.4
     * Id : 5, Name : Bablesh, Price : 43.2
     */
}
