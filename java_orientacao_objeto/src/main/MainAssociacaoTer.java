package main;

import entity.Cliente;
import entity.Endereco;

public class MainAssociacaoTer {

	public static void main(String[] args) {

		Cliente c = new Cliente(1, "Sergio", "sergio@gmail.com");
		Endereco e = new Endereco("Rua A", "Centro", "Rio de Janeiro", "RJ", "25000-000");
		// Relacionar Cliente a Endereco
		c.setEndereco(e); // TER -> CLiente tem Endereco
		// c.setEndereco(new Endereco ("Rua A", "Centro", "Rio de Janeiro", "RJ", "25000-000"));

		// Imprimindo
		System.out.println("Cliente -> " + c);
		System.out.println("Endereco -> " + c.getEndereco());

	}

}
