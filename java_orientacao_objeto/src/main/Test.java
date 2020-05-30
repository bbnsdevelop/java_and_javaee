package main;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		int iPrimitivo = 10;
		Integer iWrapper = 15;
		
		// note que os nomes dos métodos são iguais, porém as assinaturas são diferentes
		// podendo assim fazer a sebrecarga dos métodos
		
		t.imprimir(iPrimitivo);
		t.imprimir(iWrapper);
	}

	public void imprimir(int a) {
		System.out.println("Imprimindo primitivo: " + a);
	}

	public void imprimir(Integer a) {
		System.out.println("Imprimindo wrapper: " + a);
	}
}
