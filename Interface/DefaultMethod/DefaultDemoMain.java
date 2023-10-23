package DefaultMethod;

interface DefaultDemo1 {
    public default void m1() {
        System.out.println("Abstract method m1()");
    }
}

interface DefaultDemo2 {
    public default void m1() {
        System.out.println("Abstract method m2()");
    }
}

public class DefaultDemoMain implements DefaultDemo1, DefaultDemo2 {
    @Override
    public void m1() {
        DefaultDemo1.super.m1();
        System.out.println("Overrided m1()");
    }

    public static void main(String[] args) {
        DefaultDemoMain a1 = new DefaultDemoMain();
        a1.m1();
    }
}
