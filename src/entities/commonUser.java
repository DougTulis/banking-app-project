package entities;

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
	
	
	
}
