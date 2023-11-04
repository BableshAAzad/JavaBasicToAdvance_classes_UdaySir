class OuterClasss {
    int outerData = 20;
    static void display() {
        int finalData = 30; // must be final if declare local scope
        class InnerClass { // ? only abstact or final class ollowed
            // ! private, protected and public are not allowed
            int innerData = 40;
            void invoke() { // * static method are not allowed
                // System.out.println("Outer Data : " + outerData);
                System.out.println("Method final Data : " + finalData);
                System.out.println("Inner Data : " + innerData);
            }
        }
        // InnerClass ic = new InnerClass();
        // ic.invoke();
        new InnerClass().invoke();
    }
}
public class MainDemoStatic {
    public static void main(String[] args) {
        OuterClasss.display();
    }
}
