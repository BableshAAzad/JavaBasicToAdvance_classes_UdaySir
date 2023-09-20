import java.util.TreeSet;

class StudentName implements Comparable<StudentName> {
    String name;

    StudentName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + this.name;
    }

    @Override
    public int compareTo(StudentName o) {
        return this.name.compareTo(o.name);
    }
}

public class StudentNameTreeSet {
    public static void main(String[] args) {
        TreeSet<StudentName> sn = new TreeSet<>();
        sn.add(new StudentName("FG")); // 70+71 = 141
        sn.add(new StudentName("EF")); // 69+70 = 139
        sn.add(new StudentName("BC")); // 66+67 = 133
        sn.add(new StudentName("AB")); // 65+66 = 131
        sn.add(new StudentName("CD")); // 67+68 = 135
        sn.add(new StudentName("DE")); // 68+69 = 137
        for (StudentName i : sn) {
            System.out.println(i);
        }
    }
}
