package main;

import entity.Produto;
import files.ControleProduto;
import view.InputProduto;

public class MainProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		InputProduto in = new InputProduto();
		//Entrada de dados
		p.setIdProduto( in.lerIdProduto() );
		p.setNome( in.lerNome() );
		p.setPreco( in.lerPreco() );
		System.out.println("\nDados do Produto:");
		System.out.println(p);
		
		ControleProduto c = new ControleProduto();
		c.gravarDados(p);

	}

}
