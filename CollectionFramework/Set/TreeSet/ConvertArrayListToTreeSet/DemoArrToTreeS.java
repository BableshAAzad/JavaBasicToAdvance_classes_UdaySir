package ConvertArrayListToTreeSet;

import java.util.ArrayList;
import java.util.TreeSet;

public class DemoArrToTreeS {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(44);
        ar.add(37);
        ar.add(21);
        ar.add(56);
        ar.add(29);
        System.out.println("ArrayList : ");
        System.out.println(ar);
        TreeSet<Integer> ts = new TreeSet<Integer>(ar);
        System.out.println("TreeSet : ");
        System.out.println(ts);
    }
}
