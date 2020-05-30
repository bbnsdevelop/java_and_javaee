package main;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		int iPrimitivo = 10;
		Integer iWrapper = 15;
		
		// note que os nomes dos m�todos s�o iguais, por�m as assinaturas s�o diferentes
		// podendo assim fazer a sebrecarga dos m�todos
		
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
