package swingJOptinPane;

import javax.swing.JOptionPane;

public class Leitura {

	public String lerNome() {
		// exibe janela com o campo para preenchimento
		// e retorna o valor informado
		return JOptionPane.showInputDialog("Digite seu Nome:");
		// janela de entrada
	}

	// Método para ler o tipo de arquivo informado pelo usuario
	public String lerTipo() {
		// exibe janela com o campo para preenchimento
		// e retorna o valor informado
		return JOptionPane.showInputDialog("Digite o tipo de arquivo (xml ou txt):");
	}
}
