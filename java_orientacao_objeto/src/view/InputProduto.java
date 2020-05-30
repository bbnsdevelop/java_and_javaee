package view;

import java.util.Scanner;

public class InputProduto {

	public Integer lerIdProduto() {
		try { // tentativa
			Scanner s = new Scanner(System.in);
			System.out.print("Informe o Id do Produto...: ");
			Integer idProduto = s.nextInt();
			// Lê o valor informado
			if (idProduto > 0) { // teste de validação
				return idProduto; // Ok
			} else {
				// redirecionar para o catch
				// -> forçar/lançar uma exceção
				throw new Exception("Valor deve ser			maior que zero");
			}
		} catch (Exception e) { // captura do erro / exceção
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
				// lança / dispara uma nova exceção
				throw new Exception("Valor deve estar entre 1 e 10000");
			}
		} catch (Exception e) {
			System.out.println("Erro ao ler o preco	do produto -> " + e.getMessage());
			return lerPreco();
		}
	}
}
