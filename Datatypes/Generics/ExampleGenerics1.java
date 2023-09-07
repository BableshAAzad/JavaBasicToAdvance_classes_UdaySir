import java.util.ArrayList;

public class ExampleGenerics1 {
    public static void main(String[] args) {
        int a = 20; 
        double b = 1.2;
        ArrayList l = new ArrayList();
        l.add(a);    //l.add(new Integer(20));
        l.add(b);    //l.add(new Double(1.2));
        // Generalization or upcasting
        // 1. Object obj = new Integer(20);
        // 2. Object obj = new Double(1.2);
        for(Object obj : l){
            System.out.println(obj+" ");
        }
    }
}
