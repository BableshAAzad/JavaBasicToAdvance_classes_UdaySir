import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(30);
        al.add(10);
        al.add(50);
        al.add(15);
        al.add(25);
        Iterator<Integer> i = al.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
