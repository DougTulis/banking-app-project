package application;

import java.util.Locale;
import java.util.Scanner;

import entities.commonUser;

public class Program {

	public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("===========================================================");
	System.out.println("(             T R A N S F E R   S Y S T E M                         )                             ");
	System.out.println("===========================================================");
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
	System.out.print("Enter ");
	String password = sc.nextLine();

	System.out.print("Full name: ");
	String name = sc.nextLine();
	System.out.print("Initial balance: ");
	Double initBalance = sc.nextDouble();
	int decision;
	if (type.equalsIgnoreCase("individual")) {
		commonUser csr = new commonUser(name,email,password, initBalance, number);
		do {
			System.out.println("####OPTION MENU FOR INDIVIDUAL ACCOUNT USER####");
			System.out.println("[1] Check Balance");
			System.out.println("[2] Make Transferer");
			System.out.println("[3] Make Deposit");
			System.out.println("[4] Return to main menu");
			decision = sc.nextInt();
			switch(decision) {
			case 1:
				System.out.println("Balance so far: $" + String.format("%.2f",csr.getBalance()));
				System.out.println();
				break;
			case 2:
				System.out.println("Enter the email of the account you are transferring to:");
				Double value = sc.nextDouble();
				System.out.println("Enter the amount you want to transfer (Your current balance is $)"+String.format("%.2f",csr.getBalance()));
				System.out.println("Transfer successful!");
				break;
			case 3:
				System.out.println("Enter the deposit amount");
				double amount = sc.nextDouble();
				System.out.println("Deposit successfully completed!");
				break;
			case 4:
				main(args);
			}
		} while (decision > 4);
	}
	
	}
}
