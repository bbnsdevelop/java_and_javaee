package main;

import entity.Analista;
import entity.Programador;

public class MainFuncionarioHeranca {

	public static void main(String[] args) {
		
		Analista analista = new Analista(3, "João", 5000.00, "Analista de negocios");
		System.out.println("Analista: " + analista.toString());
		
		Programador programador = new Programador(4, "José", 7000.00, "Java");
		System.out.println("Programador: " + programador.toString());
		
		
	}
}
