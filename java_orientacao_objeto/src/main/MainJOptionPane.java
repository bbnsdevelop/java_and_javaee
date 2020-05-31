package main;

import javax.swing.JOptionPane;

import entity.Pessoa;
import swingJOptinPane.LeituraPessoa;

public class MainJOptionPane {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		LeituraPessoa in = new LeituraPessoa();
		try {
			p.setIdPessoa(in.lerIdPessoa());
			p.setNome(in.lerNome());
			JOptionPane.showMessageDialog(null, "Dados do Pessoa: " + p);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro -> " + e.getMessage());
		}
	}

}
