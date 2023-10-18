import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        for (Integer i : s) {
            System.out.print(i + " ");
        }
        System.out.println("\n"+s.indexOf(3));
    }
}
