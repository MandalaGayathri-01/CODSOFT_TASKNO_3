package Tasks;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		// create the scanner object to get data from the user
		Scanner sc = new Scanner(System.in);

		// create bankaccount object with initial balance of 10000/-
		BankAccount acc = new BankAccount(10000);
		int choice;

		do {
			System.out.println();
			System.out.println("======================");
			System.out.println("ATM INTERFACE");
			System.out.println("======================");
			System.out.println("1.Withdraw amount");
			System.out.println("2.Deposit amount");
			System.out.println("3.Check the balance");
			System.out.println("4.Exit");
			System.out.println("======================");

			System.out.print("Enter your choice : ");
			choice = sc.nextInt();

			// perform operation based on user's choice
			switch (choice) {

			// to withdraw amount
			case 1:
				System.out.print("Enter amount to withdraw : ");
				double withdrawAmount = sc.nextDouble();
				acc.withdraw(withdrawAmount);
				break;

			// to deposit amount
			case 2:
				System.out.print("Enter amount to deposit : ");
				double depositAmount = sc.nextDouble();
				acc.deposit(depositAmount);
				break;

			// to check the balance
			case 3:
				acc.checkBalance();
				break;

			// exit the ATM
			case 4:
				System.out.println("Thank you for using the ATM !! ");
				break;
			default:
				System.out.println("Invalid Choice !! Please select between 1 and 4 ..!");
			}
		} while (choice != 4);

		sc.close();

	}

}
