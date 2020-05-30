package main;

import entity.Cliente;
import view.InputCliente;

public class MainInputCliente {

	// Método utilizado para executar uma Classe java
	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		InputCliente in = new InputCliente();
		c.setIdCliente(in.lerIdCliente());
		c.setNome(in.lerNome());
		c.setEmail(in.lerEmail());
		
		System.out.println("\nDados do Cliente:");
		System.out.println(c);
	}

}
