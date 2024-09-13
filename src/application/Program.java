package application;

import java.util.Locale;
import java.util.Scanner;

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
		System.out.println("Tipo de conta invalida, escolha individual ou comercial.");
		main(args);
	}
	Long number = sc.nextLong();
	System.out.print("Enter the email: ");
	sc.next();
	String email = sc.nextLine();
	System.out.print("Enter Password: ");
	String password = sc.nextLine();

	System.out.print("Full name: ");
	String name = sc.nextLine();
	System.out.print("Initial balance: ");
	Double initBalance = sc.nextDouble();
	}
	

}
