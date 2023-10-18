import java.util.Stack;
import java.util.Vector;

public class VectorToStack {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        Stack<Integer> s = new Stack<Integer>();
        for (Integer i : v) {
            s.push(i);
        }
        System.out.println(s);
    }
}
