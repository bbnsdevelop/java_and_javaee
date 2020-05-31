package swingJOptinPane;

import javax.swing.JOptionPane;

public class LeituraPessoa {

	public Integer lerIdPessoa() throws Exception {
		Integer idPessoa = new Integer(JOptionPane.showInputDialog("Informe o Id da Pessoa:"));
		if (idPessoa <= 0) {
			throw new Exception("Id nao pode ser menor	ou igual a zero");
		}
		return idPessoa;
	}

	public String lerNome() throws Exception {
		String nome = JOptionPane.showInputDialog("Informe o Nome da Pessoa:");
		if (nome.length() <= 3) {
			throw new Exception("Nome de pessoa invalido");
		}
		return nome;
	}
}
