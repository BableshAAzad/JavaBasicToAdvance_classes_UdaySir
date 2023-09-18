import java.util.TreeSet;

public class ComparableDemo implements Comparable<ComparableDemo> {
    int age;

    ComparableDemo(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age : " + this.age;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        // return this.age - o.age;
        if (this.age == o.age)
            return 0;
        else if (this.age < o.age)
            return -1;
        else
            return 1;
    }

    public static void main(String[] args) {
        ComparableDemo cd1 = new ComparableDemo(20);
        ComparableDemo cd2 = new ComparableDemo(10);
        ComparableDemo cd3 = new ComparableDemo(30);
        TreeSet<ComparableDemo> t = new TreeSet<ComparableDemo>();
        t.add(cd3);
        t.add(cd1);
        t.add(cd2);
        System.out.println(t);
        for (ComparableDemo c : t) {
            System.out.println(c);
        }
    }
}
