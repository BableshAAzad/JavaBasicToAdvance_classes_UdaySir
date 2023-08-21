package TypeCasting.NonPrimitiveCasting.UpCasting;

class Father {
    String name = "John";
}

class Son extends Father {
    int age = 22;
}

public class UpCastingExample {
    public static void main(String[] args) {
       Father f = new Son();
       System.out.println(f.name);
    }
}
