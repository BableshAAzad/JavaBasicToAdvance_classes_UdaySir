import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(50, "Bablesh");
        hm.put(50, "Kumar"); // instead of "Bablesh", "kumar" is updated
        hm.put(40, "AAzad");
        hm.put(10, "Durgesh");
        hm.put(null, "Ashwanai");
        hm.put(null, "Kajol"); // instead of "Ashwanai", "Kajol" is updated
        System.out.println(hm);
        Set<Integer> keys = hm.keySet();
        for (Integer key : keys) {
            System.out.println(key + " -> " + hm.get(key));
        }
        // output :
        // {null=Kajol, 50=Kumar, 40=AAzad, 10=Durgesh}
        // null -> Kajol
        // 50 -> Kumar
        // 40 -> AAzad
        // 10 -> Durgesh
    }
}
