import java.util.Comparator;
import java.util.TreeSet;

class StudentCom {
    int age;

    StudentCom(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age : " + this.age;
    }
}

class SortSudentByAge implements Comparator<StudentCom> {
    @Override
    public int compare(StudentCom x, StudentCom y) {
        return x.age - y.age;
    }
}

public class StudentComparator {
    public static void main(String[] args) {
        StudentCom sm1 = new StudentCom(10);
        StudentCom sm2 = new StudentCom(50);
        StudentCom sm3 = new StudentCom(33);
        StudentCom sm4 = new StudentCom(90);
        StudentCom sm5 = new StudentCom(30);
        SortSudentByAge ssba = new SortSudentByAge();
        TreeSet<StudentCom> t = new TreeSet<StudentCom>(ssba);
        t.add(sm1);
        t.add(sm2);
        t.add(sm3);
        t.add(sm4);
        t.add(sm5);
        for (StudentCom s : t)
            System.out.println(s);
    }
}
