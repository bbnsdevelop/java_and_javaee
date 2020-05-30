package entity;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica() {
		// Construtor default da Classe
	}

	public PessoaFisica(Integer idCliente, String nome, String email, String cpf) {
		super(idCliente, nome, email);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
