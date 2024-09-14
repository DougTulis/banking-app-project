package entities;

public abstract class User {
	private String name;
	private String email;
	private String password;
	private Double balance;

	public User() {
	}

	public User(String name, String email, String password, Double balance) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public static void menuCommercialUser() {
		System.out.println("####OPTION MENU FOR COMMERCIAL ACCOUNT USER####");
		System.out.println("[1] Check Balance");
		System.out.println("[2] Make Deposit");
		System.out.println("[3] Return to main menu");
	}
	
	public static void menuCommonUser() {
		System.out.println("####OPTION MENU FOR INDIVIDUAL ACCOUNT USER####");
		System.out.println("[1] Check Balance");
		System.out.println("[2] Make Transferer");
		System.out.println("[3] Make Deposit");
		System.out.println("[4] Return to main menu");
	}
	
}
