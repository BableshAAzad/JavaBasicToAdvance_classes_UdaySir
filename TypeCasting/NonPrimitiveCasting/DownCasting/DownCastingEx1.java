package TypeCasting.NonPrimitiveCasting.DownCasting;

class PersonP {
    String name = "Tom";

    void eat() {
        System.out.println("Eating Biryani");
    }
}

class Students extends PersonP {
    String usn = "123xyz";

    void study() {
        System.out.println("Studing java");
    }
}

public class DownCastingEx1 {
    public static void main(String[] args) {
        PersonP p = new Students();
        System.out.println(p.name);
        p.eat();
        System.out.println("________________________");
        Students s = (Students) p;
        System.out.println(s.name + " " + s.usn);
        s.eat();
        s.study();
    }
}
