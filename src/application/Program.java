package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;
import entities.commercialUser;
import entities.commonUser;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println(" ===========================================================");
		System.out.println("(                T R A N S F E R   S Y S T E M              ");
		System.out.println( "===========================================================");
		System.out.println("MAIN MENU");
		System.out.println("Enter account data: ");
		System.out.print("Are you a individual or commercial account? ");
		String type = sc.nextLine();
		if (type.equalsIgnoreCase("individual")) {
			System.out.print("Enter the CPF number: ");
		} else if (type.equalsIgnoreCase("commercial")) {
			System.out.print("Enter the CNPJ number: ");
		} else {
			System.out.println("Invalid account type, please choose individual or commercial");
			main(args);
		}
		Long number = sc.nextLong();
		System.out.print("Enter the email: ");
		sc.next();
		String email = sc.nextLine();
		System.out.print("Enter the password: ");
		String password = sc.nextLine();

		System.out.print("Full name: ");
		String name = sc.nextLine();
		System.out.print("Initial balance: ");
		Double initBalance = sc.nextDouble();
		int decision;
		if (type.equalsIgnoreCase("individual")) {
			commonUser common = new commonUser(name, email, password, initBalance, number);
			do {
			User.menuCommonUser();
				decision = sc.nextInt();
				switch (decision) {
				case 1:
					System.out.println("Balance so far: $" + String.format("%.2f", common.getBalance()));
					System.out.println();
					break;
				case 2:
					System.out.print("Enter the email of the account you are transferring to:");
					String emailDestination = sc.next();
					System.out.print("Enter the amount you want to transfer (Your current balance is $"
							+ String.format("%.2f", common.getBalance())+"): ");
					Double amount = sc.nextDouble();
					common.transfer(amount);
					System.out.println("Transfer successful!");
					System.out.println("Current balance: $" + common.getBalance());
					break;
				case 3:
					System.out.print("Enter the deposit amount: ");
					Double amt = sc.nextDouble();
					common.deposit(amt);
					System.out.println("Deposit successfully completed!");
					System.out.println("Current balance: R$" + common.getBalance());
					break;
				case 4:
					main(args);
					break;
				}
			} while (decision > 4);
		} else {
			commercialUser commercial = new commercialUser(name, email, password, initBalance, number);
			do {
				User.menuCommercialUser();
				decision = sc.nextInt();
				switch (decision) {
				case 1:
					System.out.println("Balance so far: $" + String.format("%.2f", commercial.getBalance()));
					System.out.println();
					break;
				case 2:
					System.out.println("Enter the deposit amount");
					Double amount = sc.nextDouble();
		            commercial.deposit(amount);
					System.out.println("Deposit successfully completed!");
					System.out.println("Current balance: " + commercial.getBalance());
					break;
				case 3:
					main(args);
					break;
				}
			} while (decision > 3);

		}
		sc.close();
	}
}
