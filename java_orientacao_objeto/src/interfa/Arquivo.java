package interfa;

public interface Arquivo {

	// Interfaces são consideradas niveis abstratos de programação,
	// tudo que se declara em uma interface ou é um prototipo ou uma constante...
	// Regra 1: Métodos de uma interface não podem ter corpo, apenas
	// assinatura (cabeçalho)

	public void abrirArquivo() throws Exception;

	public void gravarDados(String texto) throws Exception;

	public void fecharArquivo() throws Exception;

}
