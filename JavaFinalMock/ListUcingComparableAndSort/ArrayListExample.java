import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample implements Comparable<ArrayListExample> {
    int age;
    String name;

    ArrayListExample(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Age : " + age + ", Name : " + name;
    }

    @Override
    public int compareTo(ArrayListExample a) {
        return this.age - a.age;
    }

    public static void main(String[] args) {
        ArrayListExample a1 = new ArrayListExample(23, "Bablesh");
        ArrayListExample a2 = new ArrayListExample(29, "Durgesh");
        ArrayListExample a3 = new ArrayListExample(25, "Kajol");
        ArrayListExample a4 = new ArrayListExample(21, "Lalita");
        ArrayListExample a5 = new ArrayListExample(26, "ArjunLal");
        ArrayList<ArrayListExample> al = new ArrayList<ArrayListExample>();
        al.add(a1);
        al.add(a2);
        al.add(a3);
        al.add(a4);
        al.add(a5);
        Collections.sort(al);
        for (ArrayListExample i : al) {
            System.out.println(i);
        }
    }
}
