class Father4 {
    int x = 10;
}

class Son4 extends Father4 {
    int y = 20;
}

class Doughter4 extends Father4 {
    int x = 30;
}

public class Example4Family {

    private static void display(Father4 obj) {
        if (obj instanceof Son4) {
            System.out.println("Downcasting to son");
            Son4 s4 = (Son4) obj;
            System.out.println(s4.x + " " + s4.y);
        } else if (obj instanceof Doughter4) {
            System.out.println("Downcasting to Doughter");
            Doughter4 d4 = (Doughter4) obj;
            System.out.println(d4.x + " " + d4.x);
        }
    }

    public static void main(String[] args) {
        display(new Son4());
        System.out.println("-----------------------");
        display(new Doughter4());
    }
}
