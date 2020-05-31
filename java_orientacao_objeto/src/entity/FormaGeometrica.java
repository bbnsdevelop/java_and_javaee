package entity;

public abstract class FormaGeometrica {

	private float base; // numero real
	private float altura; // numero real

	public FormaGeometrica() {
		// Construtor default
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	// Uma Classe abstrata pode ter m�todos tamb�m abstratos
	// ou seja, m�todos que dever�o ser implementados por outras
	// classes que herdarem a Classe abstrata
	public abstract float getArea();
	// M�todo abstrato � todo aquele que n�o possui corpo e
	// dever� ser implementado pelas subclasses
	// Um m�todo abstrato s� pode ser declarado dentro de uma
	// interface ou de uma classe abstrata

}
