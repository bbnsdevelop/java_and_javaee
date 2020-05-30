package entity;

public class Programador extends Funcionario {
	
	private String linguagem;

	public Programador() {
	}

	public Programador(Integer idFuncionario, String nome, Double salario, String linguagem) {
		super(idFuncionario, nome, salario);
		this.linguagem = linguagem;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Programador) {
			Programador p = (Programador) obj;
			if (p.getIdFuncionario().equals(getIdFuncionario()) && p.getLinguagem().equals(linguagem)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + linguagem;
	}

}
