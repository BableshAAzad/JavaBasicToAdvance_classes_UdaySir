package Class_Cast_Exeption;

class Personc {
    String name = "Bablesh";
}

class Studentc extends Personc {
    void studyc() {
        System.out.println(name + " is studying");
    }
}

class Employeec extends Personc {
    void workc() {
        System.out.println(name + " is working");
    }
}

public class Example3Runner {
    static void displayc(Personc obj) {
        if (obj instanceof Studentc) {
            Studentc std = (Studentc) obj;
            std.studyc();
        } else if (obj instanceof Employeec) {
            Employeec emp = (Employeec) obj;
            emp.workc();
        }
    }

    public static void main(String[] args) {
        displayc(new Studentc());
        System.out.println("------------------------");
        displayc(new Employeec());
    }
}
