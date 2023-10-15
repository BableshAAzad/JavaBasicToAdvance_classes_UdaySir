import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapToTreeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(3, "Bablesh");
        hm.put(5, "Durgesh");
        hm.put(1, "Lalita");
        hm.put(2, "Kajol");
        hm.put(4, "Arjun");
        Set<Integer> i = hm.keySet();
        System.out.println("Print using HashSet : ");
        for (Integer j : i) {
            System.out.println(j + " -> " + hm.get(j));
        }
        Comparator<Integer> c = (x, y) -> x.compareTo(y);
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>(c);
        tm.putAll(hm);
        Set<Integer> k = tm.keySet();
        System.out.println("\nPrint using TreeSet : ");
        for (Integer l : k) {
            System.out.println(l + " -> " + tm.get(l));
        }
    }
}
