class A {
   static int a = 10;
    static class B {
        int b = 20;
        class C {
            int c;
             void mC() {
                c = 30;
                System.out.println("Hello MethodC : " + (a + b + c));
            }
        }
    }
}
public class NestedABCClass {
    public static void main(String[] args) {
        A.B b = new A.B();
        A.B.C c = b.new C();
        c.mC();
    }
}
