package entity;

public class Triangulo extends FormaGeometrica {
	
	@Override
	public float getArea() {
		return (getBase() * getAltura()) / 2;
	}

}
