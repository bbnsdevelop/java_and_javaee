//localização do pacote
package entity;

//declaração da Classe
//Nome da Classe Cliente deve ser o nome do arquivo Cliente.java
//Deve ser uma classe de acesso publico
public class Cliente {
	
	//Atributos -> dados pertencentes a Classe
	//Visibilidade - tipo - nome
	//public -> acesso total ao elemento
	//tipos de dados (primitivos e wrappers (Classes))
	private Integer idCliente;
	private String nome;
	private String email;
	
	
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
	
	
}