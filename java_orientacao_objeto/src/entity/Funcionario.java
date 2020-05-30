package entity;

public class Funcionario {

	// declara��o dos atributos
	private Integer idFuncionario;
	private String nome;
	private Double salario;

	public Funcionario() {
		// Construtor default -> padr�o (vazio)
	}

	// Sobrecarga de M�todos (Overloading)
	public Funcionario(Integer idFuncionario, String nome, Double salario) {
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.salario = salario;
	}

	public void setIdFuncionario(Integer idFuncionario) { // entrada
		this.idFuncionario = idFuncionario;
	}

	public Integer getIdFuncionario() { // saida
		return idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
