package entity;

public class Analista extends Funcionario {
	
	private String tipo;

	public Analista() {
		// Construtor default
	}

	public Analista(Integer idFuncionario, String nome, Double salario, String tipo) {
		super(idFuncionario, nome, salario);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Analista) {
			Analista a = (Analista) obj;
			if (a.getIdFuncionario().equals(getIdFuncionario()) && a.getTipo().equals(tipo)) {
				return true; // iguais
			}
		}
		return false; // diferentes
	}

	@Override
	public String toString() {
		return super.toString() + ", " + tipo;
	}

}
