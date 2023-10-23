package AbstractMethod;

interface AbstractDemo1 {
    public default void m1() {
        System.out.println("Abstract method m1()");
    }
}

interface AbstractDemo2 {
    public default void m1() {
        System.out.println("Abstract method m2()");
    }
}

public class AbstractDemoMain implements AbstractDemo1, AbstractDemo2 {
    @Override
    public void m1() {
        AbstractDemo1.super.m1();
        System.out.println("Overrided m1()");
    }

    public static void main(String[] args) {
        AbstractDemoMain a1 = new AbstractDemoMain();
        a1.m1();
    }
}
