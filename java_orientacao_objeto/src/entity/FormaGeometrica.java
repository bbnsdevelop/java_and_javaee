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

	// Uma Classe abstrata pode ter métodos também abstratos
	// ou seja, métodos que deverão ser implementados por outras
	// classes que herdarem a Classe abstrata
	public abstract float getArea();
	// Método abstrato é todo aquele que não possui corpo e
	// deverá ser implementado pelas subclasses
	// Um método abstrato só pode ser declarado dentro de uma
	// interface ou de uma classe abstrata

}
