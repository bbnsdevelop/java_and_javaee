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

	@Override
	// annotation -> sobrescrita
	public boolean equals(Object obj) {
		// verificar se o parametro 'obj' � do tipo Funcionario
		// Se 'obj' � uma instancia de Funcionario
		if (obj instanceof Funcionario) { // � do tipo?
			// converter 'obj' para Funcionario
			Funcionario f = (Funcionario) obj; // casting
			return f.getIdFuncionario().equals(idFuncionario);
			// if(f.getIdFuncionario() == this.idFuncionario){
			// return true;
			// }
		}
		// default retornar falso
		return false;
	}

	@Override
	public String toString() {
		return idFuncionario + ", " + nome + ", " + salario;
	}

	@Override
	public int hashCode() { // regra de ordena��o
		// Geralmente a regra de ordena��o do hashCode
		// � baseada na regra do equals
		return idFuncionario.hashCode();
	}

}
