package entity;

public class Retangulo extends FormaGeometrica {
	/*
	 * A Classe Retangulo obrigatoriamente deve fornecer corpo para o método getArea
	 * declarado na Classe Abstrata, pois o método foi declarado como abstract
	 */
	@Override
	public float getArea() {
		return getBase() * getAltura();
	}

}
