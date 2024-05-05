package projeto.projetografos; 

import java.nio.file.Files; // 
import java.nio.file.Path; // 
import java.nio.file.Paths; // Importação das classes necessárias para localizar e carregar os arquivos de entrada.

/**
 * Classe responsável por ler o conteúdo de um arquivo de texto e fazer a conversão para grafo de  aresta.
 */

public class LerArquivo {

    private String transformaEmStr; // Variável para armazenar o conteúdo do arquivo como uma string

    /**
     * Construtor da classe LerArquivo.
     * Lê o conteúdo do arquivo especificado e armazena em uma string.
     * @recebe como parâmetro uma string nomeArquivo, que serve para encontrar no endereço o título do arquivo
     * que será carregado.
     */
    public LerArquivo(String nomeArquivo) {
        // Cria um objeto Path com o caminho do arquivo
        Path caminho = Paths.get("/home/usuario/Área de trabalho/InstantTransmissionJframeBackground/src/main/resources/entradaTxt/" + nomeArquivo + ".txt");
        try {
            // Lê todos os bytes do arquivo
            byte[] bytesDoArquivo = Files.readAllBytes(caminho);
            // Converte os bytes em uma string
            transformaEmStr = new String(bytesDoArquivo);
        } catch (Exception e) {
            // Em caso de exceção, definimos transformaEmStr como uma mensagem de erro
            transformaEmStr = "Erro inesperado: " + e.getMessage();
        }
    }

    /**
     * Método para retornar o conteúdo do arquivo ou a mensagem de erro como uma string.
     */
    public String getConteudoArquivo() {
        return transformaEmStr;
    }
}
