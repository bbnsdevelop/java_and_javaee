package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Produto;
import files.ControleProduto;
import view.InputProduto;

public class MainListProduto {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		//do {
			InputProduto in = new InputProduto();
			Produto p = new Produto();

			p.setIdProduto(in.lerIdProduto());
			p.setNome(in.lerNome());
			p.setPreco(in.lerPreco());
			produtos.add(p);

	//	} while (cadastrarNovoProduto());
		try {
			ControleProduto c = new ControleProduto();
			c.gravarDados(produtos);
		} catch (Exception e) {
			System.out.println("Erro ao gravar	arquivo: " + e.getMessage());
		}

	}

	public static boolean cadastrarNovoProduto() {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.print("Digite 1 para cadastrar: ");
			int opcao = entrada.nextInt();
			if (opcao == 1) {
				entrada.close();
				return true;
			} else {
				entrada.close();
				return false;
			}
		} catch (Exception e) {
			entrada.close();
			return false;
		}
	}

}
