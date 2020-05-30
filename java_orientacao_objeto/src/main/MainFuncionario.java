package main;

import entity.Funcionario;

public class MainFuncionario {

	public static void main(String[] args) {
		// Classe -> Objeto
		Funcionario f1 = new Funcionario(1, "Ana", 1000.0);
		Funcionario f2 = new Funcionario(1, "Rui", 2000.0);
		// equals é um metodo herdado da Classe Object
		if (f1.equals(f2)) {
			System.out.println("Funcionarios iguais");
		} else {
			System.out.println("Funcionarios diferentes");
		}

		System.out.println("Funcionario: " + f1); // toString
		System.out.println("Funcionario: " + f2); // toString
		
		System.out.println("HashCode de f1: " + f1.hashCode());
		System.out.println("HashCode de f2: " + f2.hashCode());
	}
}
