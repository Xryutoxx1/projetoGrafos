package projeto.projetografos; // Declaração do pacote do projeto

import java.io.IOException; // Importa a classe IOException para tratamento de exceção de IO
import java.nio.file.Files; // Importa a classe Files para operações de arquivo
import java.nio.file.Path; // Importa a classe Path para representar caminhos de arquivo
import java.nio.file.Paths; // Importa a classe Paths para criação de objetos Path

public class LerArquivo { // Declaração da classe LerArquivo
    
    private int[] grafo; // Array para armazenar os números lidos do arquivo
    private String transformaEmStr; // String para armazenar o conteúdo do arquivo como texto
    private int[][] matriz; // Matriz para armazenar os números do grafo em formato de matriz

    // Construtor que recebe o nome do arquivo como parâmetro
    public LerArquivo(String nomeArquivo) {
        Path caminho = Paths.get("src\\main\\resources\\entradaTxt\\" + nomeArquivo + ".txt"); // Caminho do arquivo
        
        try {
            byte[] bytesDoArquivo = Files.readAllBytes(caminho); // Lê todo o conteúdo do arquivo em bytes
            transformaEmStr = new String(bytesDoArquivo); // Converte os bytes em uma string
            
            // Divide a string em substrings usando espaços como delimitadores
            String[] transformaStrEmInt = transformaEmStr.split("\\s+");
            
            grafo = new int[transformaStrEmInt.length]; // Inicializa o array grafo com o tamanho da string dividida
            for(int i = 0; i < transformaStrEmInt.length; i++){
                grafo[i] = Integer.parseInt(transformaStrEmInt[i]); // Converte as substrings em inteiros e armazena no array grafo
            } 
            
            int linhacoluna = (int) Math.sqrt(transformaStrEmInt.length); // Calcula o tamanho de uma linha/coluna da matriz
            matriz = new int[linhacoluna][linhacoluna]; // Inicializa a matriz com o tamanho calculado
            int index = 0;
            
            // Preenche a matriz com os valores do array grafo
            for(int i =0; i < linhacoluna; i++){
                for(int j = 0; j < linhacoluna;  j++){
                    matriz[i][j] = grafo[index]; // Atribui o valor do array grafo à posição correspondente na matriz
                    index++;
                }
            }
        } catch (IOException e) { // Trata exceções de IO
            transformaEmStr = "Erro inesperado: " + e.getMessage(); // Mensagem de erro em caso de exceção
        }
    }
    
    // Método para obter o conteúdo do arquivo convertido em uma representação de grafo de aresta
    public String getConteudoArquivo() {
        Conversora conversora = new Conversora(); // Instância de Conversora
        return conversora.conversorGrafoDeAresta(matriz); // Chama o método conversorGrafoDeAresta da instância conversora
    }
}
