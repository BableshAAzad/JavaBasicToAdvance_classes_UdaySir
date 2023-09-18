import java.util.*;

public class DemoListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(30);
        al.add(10);
        al.add(50);
        al.add(15);
        al.add(25);
        ListIterator<Integer> i = al.listIterator();
        System.out.println("For forword direction : ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println("\nFor reverse direction : ");
        while(i.hasPrevious()){
            System.out.print(i.previous()+" ");
        }
    }
}
