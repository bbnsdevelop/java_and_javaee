package main;

import entity.Cliente;

//Classe utilizada para exeutar o projeto Java local
public class Main {
	
	//Em java, para executar uma Classe, é necessário um
	//método com a assinatura: static void main
	public static void main(String[] args) {

		//Classe -> Objeto
		Cliente c1 = new Cliente();
		c1.setIdCliente(1);
		c1.setNome ("Sergio Mendes");
		c1.setEmail ("sergio.coti@gmail.com");
		System.out.println("Id.....: " + c1.getIdCliente());
		System.out.println("Nome...: " + c1.getNome());
		System.out.println("Email..: " + c1.getEmail());
		//imprimir mensagem no console
		//syso -> ctrl + espaço
		System.out.println("Bem vindo ao Java - Turma BRQ COTI");
		
	}
}