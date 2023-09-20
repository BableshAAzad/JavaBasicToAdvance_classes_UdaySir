import java.util.TreeSet;

class PersonT implements Comparable<PersonT> {
    Double height;

    PersonT(double height) { // if you want to pass Double then its also be working
        this.height = height;
    }

    @Override
    public String toString() {
        return "Height : " + height;
    }

    @Override
    public int compareTo(PersonT t) {
        return this.height.compareTo(t.height);
    }
}

public class PersonHeight {
    public static void main(String[] args) {
        PersonT t1 = new PersonT(30.5);
        PersonT t2 = new PersonT(10.3);
        PersonT t3 = new PersonT(40.3);
        PersonT t4 = new PersonT(20.5);
        PersonT t5 = new PersonT(25.1);
        PersonT t6 = new PersonT(17.6);
        PersonT t7 = new PersonT(31.9);
        TreeSet<PersonT> ts = new TreeSet<>();
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        ts.add(t5);
        ts.add(t6);
        ts.add(t7);
        for (PersonT i : ts) {
            System.out.println(i);
        }
    }
}
