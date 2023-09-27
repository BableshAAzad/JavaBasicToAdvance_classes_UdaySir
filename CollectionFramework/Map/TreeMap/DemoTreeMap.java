
import java.util.*;

public class DemoTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        // Adding elements to the tree map
        treeMap.put("D", 7);
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        // Getting values from the tree map
        int valueA = treeMap.get("A");
        System.out.println("Value of A: " + valueA);
        // Removing elements from the tree map
        treeMap.remove("B");
        // Iterating over the elements of the tree map
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
