import java.util.Scanner;

class Person {
    private int password;

    public void setPassword(int password) {
        String pass = "" + password;
        if (pass.length() >= 8) {
            this.password = password;
            System.out.println("Password Initialized");
        } else
            System.out.println("Invalid Password");
    }

    public int getPassword() {
        return password;
    }
}

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Enter password : ");
        int password = sc.nextInt();
        sc.close();
        p.setPassword(password);
        System.out.println("Your password : " + p.getPassword());
    }
}
