package BalanceCheck;

import java.util.Scanner;

public class CheckBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1: For check balance\n 2: Deposite amounnt\n Enter a Option :");
        int n = sc.nextInt();
        int balance = 0;
        if (n == 1) {
            if (balance >= 1) {
                System.out.println("Your Balance is : " + balance);
            } else {
                try {
                    throw new InseficiantBalanceException("Insufficient Balance Exception");
                } catch (InseficiantBalanceException e) {
                    // System.out.println(e.getMessage());
                    e.printStackTrace(); // Given all information about Exception
                }
            }
        } else if (n == 2) {
            System.out.println("Enter Deposite Amount : ");
            int m = sc.nextInt();
            balance = balance + m;
            System.out.println("Current balance is : " + balance);
        } else {
            System.out.println("Please Enter Valid number.......");
        }
        // sc.close();
    }
}
