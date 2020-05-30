package view;

import java.util.Scanner;

public class InputCliente {

	// Método para ler e retornar o id de um Cliente informado
	public Integer lerIdCliente() {
		Scanner leitura = new Scanner(System.in);
		System.out.print("Informe o Id do Cliente.....: ");
		return leitura.nextInt(); // lê e retorna inteiro
	}

	// Método para ler e retornar o nome de um Cliente informado
	public String lerNome() {
		// Scanner -> Classe Java para leitura de
		// dados em Java local
		Scanner leitura = new Scanner(System.in);
		System.out.print("Informe o Nome do Cliente...: ");
		return leitura.nextLine(); // lê e retorna String
	}

	// Método para ler e retornar o nome de um Cliente informado
	public String lerEmail() {
		// Scanner -> Classe Java para leitura de dados
		// em Java local
		Scanner leitura = new Scanner(System.in);
		System.out.print("Informe o Email do Cliente..: ");
		return leitura.nextLine(); // lê e retorna String
	}
}
