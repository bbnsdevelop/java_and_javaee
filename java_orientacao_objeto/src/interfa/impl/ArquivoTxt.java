package interfa.impl;

import java.io.FileWriter;

import interfa.Arquivo;

public class ArquivoTxt implements Arquivo {
	
	// Regra: Quando uma Classe implementa uma ou mais interfaces
	// esta Classe é obrigada a fornecer corpo para todos os métodos
	// abstratos da interface
	// Atributo
	private FileWriter arquivo;

	@Override // Sobrescrita
	public void abrirArquivo() throws Exception {
		// inicializando o arquivo em modo de escrita
		// true -> incluir conteudo ao final do arquivo
		arquivo = new FileWriter("c:\\aula\\exemplo.txt", true);
	}

	@Override // Sobrescrita
	public void gravarDados(String texto) throws Exception {
		arquivo.write(texto);
		// escrevendo o parametro texto dentro do arquivo
		arquivo.write("\n"); // escrevendo uma quebra de linha
	}

	@Override // Sobrescrita
	public void fecharArquivo() throws Exception {
		arquivo.close(); // fechando o arquivo
	}

}
