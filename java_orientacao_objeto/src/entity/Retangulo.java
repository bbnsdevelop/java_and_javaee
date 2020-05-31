package entity;

public class Retangulo extends FormaGeometrica {
	/*
	 * A Classe Retangulo obrigatoriamente deve fornecer corpo para o m�todo getArea
	 * declarado na Classe Abstrata, pois o m�todo foi declarado como abstract
	 */
	@Override
	public float getArea() {
		return getBase() * getAltura();
	}

}
