package calculatorrr;

import java.util.Scanner;

interface Calculator {
    void sum(int a, int b);

    void sub(int a, int b);

    void mul(int a, int b);

    void que(int a, int b);

    void div(int a, int b);
}

class CalculatorImp implements Calculator {
    @Override
    public void sum(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("Substraction of " + a + " and " + b + " is : " + (a - b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " is : " + (a * b));
    }

    @Override
    public void que(int a, int b) {
        System.out.println("Qutient of " + a + " and " + b + " is : " + (a / b));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("Reminder of " + a + " and " + b + " is : " + (a % b));
    }
}

public class CalsiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new CalculatorImp();
        System.out.println(
                "1: Addition \n2: Substraction \n3: Multiplication \n4: Qutient \n5: Remainder \n\nEnter a Choice : ");
        int choice = sc.nextInt();
        int a = 0;
        int b = 0;
        if (choice >= 1 && choice <= 4) {
            System.out.println("Enter first value : ");
            a = sc.nextInt();
            System.out.println("Enter Second values : ");
            b = sc.nextInt();
        }
        sc.close();
        switch (choice) {
            case 1:
                calc.sum(a, b);
                break;
            case 2:
                calc.sub(a, b);
                break;
            case 3:
                calc.mul(a, b);
                break;
            case 4:
                calc.que(a, b);
                break;
            case 5:
                calc.div(a, b);
                break;
            default:
                System.out.println("Invalid Choice...");
        }
    }
}
