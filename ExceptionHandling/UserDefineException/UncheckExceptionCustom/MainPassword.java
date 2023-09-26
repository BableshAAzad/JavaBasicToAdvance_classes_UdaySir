import java.util.Scanner;

class InvalidPasswordException extends RuntimeException {
    private String message;

    InvalidPasswordException(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}

public class MainPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");
        int password = sc.nextInt();
        sc.close();
        if (password == 123) {
            System.out.println("Login succesfull.....");
        } else {
            try {
                throw new InvalidPasswordException("Invalid password...");
            } catch (InvalidPasswordException e) {
                System.out.println(e.toString());
            }
        }
    }
}