package interfa;

public interface Arquivo {

	// Interfaces s�o consideradas niveis abstratos de programa��o,
	// tudo que se declara em uma interface ou � um prototipo ou uma constante...
	// Regra 1: M�todos de uma interface n�o podem ter corpo, apenas
	// assinatura (cabe�alho)

	public void abrirArquivo() throws Exception;

	public void gravarDados(String texto) throws Exception;

	public void fecharArquivo() throws Exception;

}
