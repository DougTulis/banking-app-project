package entities;

import entities.exceptions.AccountException;

public class commonUser extends User {

	private Long cpf;

	public commonUser(String name, String email, String password, Double balance, Long cpf) {
		super(name, email, password, balance);
		this.cpf = cpf;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	
	public void transfer(Double amount) {
		if (amount > getBalance()) {
			throw new AccountException("Amount must be greater than the balance.");
		} else setBalance(getBalance() - amount);
		}
	
    public void deposit(Double amount) {
    	setBalance(getBalance() + amount);
	}
	
}
