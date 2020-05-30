package main;

import entity.Cliente;

//Classe utilizada para exeutar o projeto Java local
public class Main {
	
	//Em java, para executar uma Classe, é necessário um
	//método com a assinatura: static void main
	public static void main(String[] args) {

		//Classe -> Objeto
		Cliente c1 = new Cliente();
		c1.idCliente = 1;
		c1.nome = "Sergio Mendes";
		c1.email = "sergio.coti@gmail.com";
		System.out.println("Id.....: " + c1.idCliente);
		System.out.println("Nome...: " + c1.nome);
		System.out.println("Email..: " + c1.email);
		//imprimir mensagem no console
		//syso -> ctrl + espaço
		System.out.println("Bem vindo ao Java - Turma BRQ COTI");
		
	}
}