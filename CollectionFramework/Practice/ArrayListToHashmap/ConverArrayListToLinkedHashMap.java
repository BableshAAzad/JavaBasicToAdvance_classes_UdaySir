import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class ConverArrayListToLinkedHashMap {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Bablesh");
        ar.add("Kumar");
        ar.add("AAzad");
        ar.add("Durgesh");
        ar.add("Kajol");
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
        int a = 1;
        for (String s : ar) {
            hm.put(s, a);
            a++;
        }
        Set<String> i = hm.keySet();
        for (String j : i) {
            System.out.println("Name : " + j + " -> " + hm.get(j));
        }
    }
}
