package main;

import javax.swing.JOptionPane;

import interfa.Arquivo;
import interfa.impl.ArquivoTxt;
import interfa.impl.ArquivoXml;
import swingJOptinPane.Leitura;

public class MainLeitura {

	public static void main(String[] args) {
		Leitura in = new Leitura();
		// instanciando a Classe de leitura
		// new -> executa o construtor para
		// definir espaço de memória
		// null -> sem espaço de memória (vazio),
		// não tem ponteiro
		Arquivo a = null;
		// lendo o tipo de arquivo informado pelo usuario
		String tipo = in.lerTipo();

		if (tipo.equalsIgnoreCase("txt")) {
			a = new ArquivoTxt(); // polimorfismo
		} else if (tipo.equalsIgnoreCase("xml")) {
			a = new ArquivoXml(); // polimorfismo
		}
		try {
			a.abrirArquivo();
			a.gravarDados(in.lerNome());
			a.fecharArquivo();
			JOptionPane.showMessageDialog(null, "Dados gravados.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
	}

}
