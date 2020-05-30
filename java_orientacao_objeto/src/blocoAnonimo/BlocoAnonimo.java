package blocoAnonimo;

public class BlocoAnonimo {
	{
		// bloco anônimo -> executado antes do construtor
		System.out.println("Executando o bloco anonimo");
	}

	public BlocoAnonimo() {
		System.out.println("Executando o Construtor de Teste");
	}
}
