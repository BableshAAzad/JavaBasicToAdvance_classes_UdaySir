/**
 * Rules for Override equals() :
 * 1 : Upcasting
 * 2 : Downcasting
 * 3 : Comparision logic
 */

public class DemoEqualsMethod {
    int age;

    DemoEqualsMethod(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        DemoEqualsMethod o = (DemoEqualsMethod) obj;
        return this.age == o.age;
    }

    public static void main(String[] args) {
        DemoEqualsMethod w1 = new DemoEqualsMethod(10);
        DemoEqualsMethod w2 = new DemoEqualsMethod(10);
        System.out.println(w1.equals(w2));
    }
}
