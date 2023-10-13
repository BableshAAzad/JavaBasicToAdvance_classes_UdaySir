import java.util.*;

public class PrintHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(20);
        hs.add(30);
        hs.add(10);
        hs.add(40);
        hs.add(50);
      System.out.println(hs);
      ListIterator<Integer> i = hs.listIterator();
      while(i.hasPrevious()){
        System.out.println(i.previous());
      }
    }
}
