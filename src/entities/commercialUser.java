package entities;

public class commercialUser extends User{

	private Long cnpj;

	public commercialUser(String name, String email, String password, Double balance, Long cnpj) {
		super(name, email, password, balance);
		this.cnpj = cnpj;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
}
