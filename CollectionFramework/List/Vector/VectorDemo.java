import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        for (Integer i : v) {
            System.out.print(i + " ");
        }
        System.out.println("\n"+v.indexOf(3));
    }
}
