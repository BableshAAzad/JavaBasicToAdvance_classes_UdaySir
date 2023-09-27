import java.util.LinkedHashMap;
import java.util.Set;

public class DemoLinkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(50, "Bablesh");
        lhm.put(90, "Kumar");
        lhm.put(20, "AAzad");
        lhm.put(30, "Durgesh");
        lhm.put(10, "kajol");
        System.out.println(lhm);
        Set<Integer> keys = lhm.keySet();
        for (int key : keys) {
            System.out.println(key + " -> " + lhm.get(key));
        }
    }
}
