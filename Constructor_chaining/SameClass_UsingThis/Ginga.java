// package Constructor_chaining.SameClass_UsingThis;

public class Ginga {
    Ginga(int x) {
        System.out.println(1);
    }

    Ginga() {
        this(10);
        System.out.println(2);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        new Ginga();
        System.out.println("End");
    }
}
