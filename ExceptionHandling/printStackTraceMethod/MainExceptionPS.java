import java.util.Scanner;

public class MainExceptionPS {
    static void checkOTP(int otp) throws MyExceptionPS{
        if(otp == 123)
          System.out.println("Valid OTP, Logged in successfully");
        else
           throw new MyExceptionPS("Invalid otp entered");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you otp : ");
        int opt = sc.nextInt();
        sc.close();
        // try{
        //     checkOTP()
        // }
        // catch{
        //     ca
        // }
    }
}
