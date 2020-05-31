package interfa.impl;

import java.io.FileWriter;

import interfa.Arquivo;

public class ArquivoXml implements Arquivo {
	// Atributo para escrita de arquivos (java.io)
	private FileWriter arquivo; // null

	@Override
	public void abrirArquivo() throws Exception {
		// inicializando e abrindo um arquivo para escrita
		arquivo = new FileWriter("c:\\aula\\exemplo.xml");
	}

	@Override
	public void gravarDados(String texto) throws Exception {
		arquivo.write("<?xml version='1.0' encoding='iso-8859-1' ?>");
		arquivo.write("<aula>");
		arquivo.write("<nome>" + texto + "</nome>");
		arquivo.write("</aula>");
	}

	@Override
	public void fecharArquivo() throws Exception {
		arquivo.close(); // fechando o arquivo
	}

}
