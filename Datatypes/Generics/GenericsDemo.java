import java.util.*;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Web");
        l.add("Sql");
        l.add("Java");
        l.add("Python");
        for (String s : l) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        System.out.println("-----------------------");
        ArrayList<Integer> ll = new ArrayList<Integer>();
        ll.add(12);
        ll.add(15);
        ll.add(20);
        for(int i : ll){
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("-----------------------");
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(1.4);
        al.add('Z');
        for(Object obj : al){
            System.out.print(obj+" ");
        }
    }
}
