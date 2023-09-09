import java.util.Scanner;

interface Bank {
	void deposite(int amount);

	void withdrow(int amount);

	void checkbalance();
}

public class ATMmain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Check Balance\n2.Cash Withdrow\n3.Cash Deposite");
		System.out.println();
		System.out.println("Enter Option number : ");
		System.out.println();
		Bank b = new ATM();
		int n = sc.nextInt();

		switch (n) {
		case 1: {
			b.checkbalance();
			break;
		}
		case 2: {
			System.out.println("Enter Withrowing Amount : ");
			int w = sc.nextInt();
			b.withdrow(w);
			break;
		}
		case 3: {
			System.out.println("Enter Deposite Amount : ");
			int d = sc.nextInt();
			b.deposite(d);
			break;
		}
		default: {
			System.out.println("Please choose a valid option");
		}
		}
	}
}

class ATM implements Bank {
	int balance = 5000;

	@Override
	public void deposite(int amount) {
		System.out.println("Deposite amount : " + amount);
		balance = balance + amount; // balance += amount
		System.out.println("Amount deposite succesfully\n");
		System.out.println("Availabel balance : " + balance);
	}

	@Override
	public void withdrow(int amount) {
		if (amount > balance) {
			System.out.println("insufficient Balance");
		} else {
			System.out.println("Withdrowing Rs. : " + amount);
			balance -= amount; // balance = balance - amount
			System.out.println("Amount withdrow succesfully\n");
			System.out.println("Availabel balance : " + balance);
		}
	}

	@Override
	public void checkbalance() {
		System.out.println("Available balance : " + balance);
	}

}
