public class DemoFinalClass {
    public static void main(String[] args) {
       DemoFinalClass2.demo();
    }
}

class DemoFinalClass1 {
    static void demo() {
        System.out.println("Hello");
    }
}

class DemoFinalClass2 extends DemoFinalClass1 {
    // @Override
    static void demo() {
        // super.demo(); // it is not working
        System.out.println("Hi");
    }
}
