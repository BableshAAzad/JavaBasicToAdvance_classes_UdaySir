package Interface;

interface Calculator {
    void add(int a, int b);
}

class CalculatorImp implements Calculator {
    @Override
    public void add(int a, int b) {
        System.out.println("Sum of " + a + " & " + b + " is : " + (a + b));
    }
}

public class MainCalculator4 {
    public static void main(String[] args) {
        CalculatorImp cimp = new CalculatorImp();
        cimp.add(10, 20);
    }
}
