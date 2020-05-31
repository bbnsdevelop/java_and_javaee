//localização do pacote
package entity;

//declaração da Classe
//Nome da Classe Cliente deve ser o nome do arquivo Cliente.java
//Deve ser uma classe de acesso publico
public class Cliente {

	// Atributos -> dados pertencentes a Classe
	// Visibilidade - tipo - nome
	// public -> acesso total ao elemento
	// tipos de dados (primitivos e wrappers (Classes))
	private Integer idCliente;
	private String nome;
	private String email;
	private Endereco endereco; // Associação (TER)

	// Construtor é um método que tem o mesmo nome da Classe
	// e não possui tipo definido de retorno
	public Cliente() {
		// Construtor default da Classe (vazio)
	}

	// Construtor com entrada de parametros (dados)
	// Sobrecarga de Métodos (Overloading)
	// Métodos com o mesmo nome, na mesma Classe,
	// com entrada de dados diferentes
	public Cliente(Integer idCliente, String nome, String email) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return endereco;
		}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + "]";
	}

}