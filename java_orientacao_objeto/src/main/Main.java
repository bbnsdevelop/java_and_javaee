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

		
		Cliente c2 = new Cliente(1, "Ana", "ana@gmail");
		
		System.out.println("\nDados de Cliente:");
		System.out.println("Id.....: " + c2.getIdCliente());
		System.out.println("Nome...: " + c2.getNome());
		System.out.println("Email..: " + c2.getEmail());
		
		
	}
}