package files;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import entity.Produto;

public class ControleProduto {

	// Método utilizado para gravar os dados de
	// um produto em arquivo txt
	public void gravarDados(Produto p) {
		try {
			// Classe -> FileWriter (Escrita de Arquivos)
			// true -> modo append -> adicionar conteudo ao
			// final do arquivo
			// false -> sempre sobrescrever/substituir o
			// arquivo antigo
			// FileWriter lança (throws) IOException

			File dir = new File("C:\\aula\\produtos");
			if (!dir.exists()) {
				dir.mkdirs();
			}
			FileWriter fw = new FileWriter("c:\\aula\\produtos\\produtos.txt", true);
			fw.write("Dados -> " + p);
			// escrevendo no arquivo o toString da Classe
			fw.write("\n"); // quebra de linha
			fw.close(); // fechando o arquivo
			System.out.println("Dados gravados	com sucesso.");
		} catch (Exception e) {
			System.out.println("Erro ao gravar	arquivo: " + e.getMessage());
		}
	}

	public void gravarDados(List<Produto> produtos) throws Exception {
		for(int i = 0; i < produtos.size(); i++){
			gravarDados(produtos.get(i));
		}
	}

}
