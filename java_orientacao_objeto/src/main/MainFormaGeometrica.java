package main;

import entity.FormaGeometrica;
import entity.Retangulo;
import entity.Triangulo;

public class MainFormaGeometrica {

	public static void main(String[] args) {
		// Não é boa prática inicializar uma Classe abstrata
		// através de seu construtor...
		FormaGeometrica f = new Triangulo();
		
		// tipo objeto instancia -> comportamento
		f.setBase(10.0f);
		f.setAltura(5.0f);
		System.out.println("Base -> " + f.getBase());
		System.out.println("Altura -> " + f.getAltura());
		System.out.println("Area do objeto: " + f.getArea());
		
		if (f instanceof Retangulo) {
			System.out.println("Calculo de Area de Retangulo");
		} else if (f instanceof Triangulo) {
			System.out.println("Calculo de Area de Triangulo");
		}

	}

}
