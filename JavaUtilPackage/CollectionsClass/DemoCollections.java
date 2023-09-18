import java.util.*;

public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(30);
        al.add(10);
        al.add(50);
        al.add(15);
        al.add(25);
        System.out.println("Previous shorting : ");
        System.out.println(al);
        System.out.println();
        System.out.println("After shorting : ");
        Collections.sort(al);
        System.out.println(al);
        System.out.println();
        System.out.println("After reversing : ");
        Collections.reverse(al); // if you want to be reverse then mindatory before required short then reverse
        System.out.println(al);
    }
}
