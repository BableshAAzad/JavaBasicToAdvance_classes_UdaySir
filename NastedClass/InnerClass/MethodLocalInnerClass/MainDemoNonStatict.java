
class OuterClass {
    int outerData = 20;

    public void display() {
        int finalData = 30; // must be final if declare local scope
        class InnerClass { // ? only abstact or final class ollowed
            // ! private, protected and public are not allowed
            int innerData = 40;
            public void invoke() { // * static method are not allowed
                System.out.println("Outer Data : " + outerData);
                System.out.println("Method final Data : " + finalData);
                System.out.println("Inner Data : " + innerData);
            }
        }
        // InnerClass ic = new InnerClass();
        // ic.invoke();
        new InnerClass().invoke();
    }
}

public class MainDemoNonStatict {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.display();
    }

}
