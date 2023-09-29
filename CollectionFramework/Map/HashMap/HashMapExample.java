import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put("Bablesh", 88173);
		hm.put(123, 304.3);
		hm.put('A', 2423);
		hm.put(132, "AAzad");
		hm.put('Z', 54.39);
		System.out.println(hm);
		
		Set<HashMapExample> i = hm.keySet();
		for(Object k : i) {
			System.out.println(k+" --> "+hm.get(k));
		}
	}
}
