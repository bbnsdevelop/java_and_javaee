package view;

import java.util.Scanner;

public class InputProduto {

	public Integer lerIdProduto() {
		try { // tentativa
			Scanner s = new Scanner(System.in);
			System.out.print("Informe o Id do Produto...: ");
			Integer idProduto = s.nextInt();
			// L� o valor informado
			if (idProduto > 0) { // teste de valida��o
				return idProduto; // Ok
			} else {
				// redirecionar para o catch
				// -> for�ar/lan�ar uma exce��o
				throw new Exception("Valor deve ser			maior que zero");
			}
		} catch (Exception e) { // captura do erro / exce��o
			System.out.println("Erro ao ler o id do produto -> " + e.getMessage());
			return lerIdProduto(); // recursividade
		}
	}

	public String lerNome() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Informe o Nome do Produto.: ");
			String nome = s.nextLine();
			return nome;
		} catch (Exception e) {
			System.out.println("Erro ao ler o nome		do produto -> " + e.getMessage());
			return lerNome();
		}
	}

	public Double lerPreco() {
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Informe o Preco do Produto: ");
			Double preco = s.nextDouble();
			if (preco > 0 && preco <= 10000) {
				return preco;
			} else {
				// lan�a / dispara uma nova exce��o
				throw new Exception("Valor deve estar entre 1 e 10000");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler o preco	do produto -> " + e.getMessage());
			return lerPreco();
		}
	}
}
