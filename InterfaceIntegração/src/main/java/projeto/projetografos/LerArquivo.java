package projeto.projetografos; 

import java.nio.file.Files; // 
import java.nio.file.Path; // 
import java.nio.file.Paths; // Importação das classes necessárias para localizar e carregar os arquivos de entrada.

/**
 * Classe responsável por ler o conteúdo de um arquivo de texto e fazer a conversão para grafo de  aresta.
 */

public class LerArquivo {
    
    private int[] grafo;
    private String transformaEmStr; // Variável para armazenar o conteúdo do arquivo como uma string

    /**
     * Construtor da classe LerArquivo.
     * Lê o conteúdo do arquivo especificado e armazena em uma string.
     * @recebe como parâmetro uma string nomeArquivo, que serve para encontrar no endereço o título do arquivo
     * que será carregado.
     */
    public LerArquivo(String nomeArquivo) {
        // Cria um objeto Path com o caminho do arquivo
        Path caminho = Paths.get("C:/Users/lucas/Downloads/grafosupdate/projetoGrafos-main/" + nomeArquivo + ".txt");
        try {
            // Lê todos os bytes do arquivo
            byte[] bytesDoArquivo = Files.readAllBytes(caminho);
            // Converte os bytes em uma string
            transformaEmStr = new String(bytesDoArquivo);
            
            //transformar os numeros em um vetor de inteiros
            String[] transformaStrEmInt = transformaEmStr.split("\\s+"); //divide a string utilizando espaços como parametro
            grafo = new int[transformaStrEmInt.length]; //criando um vetor do tamanho de transformaStrEmInt
            for(int i = 0; i < transformaStrEmInt.length; i++){
                grafo[i] = Integer.parseInt(transformaStrEmInt[i]); //Transporta os STR para o novo vetor e transforma em INT
                } 
            
            /*aqui será feita a divisão dos números em vetores de iguais*/
            int linhacoluna = (int) Math.sqrt(transformaStrEmInt.length);/*pegando o tamanho de linhas e colunas usando a raiz da matriz*/
            int linhacoluna1 = linhacoluna; /*cópia de linhacoluna para não ter problema nos loops encadiados*/
            int[][] matriz = new int[linhacoluna][linhacoluna]; /*nova matriz criada com o tamanho total de linhas e colunas geradas pela raiz da matriz original)*/
            int index = 0;
            
            for(int i =0; i < linhacoluna; i++){
                for(int j = 0; j < linhacoluna1;  j++){
                matriz[i][j] = grafo[index];
                index++;
                }
                
            for(int x =0; x < grafo.length; x++){
                int QntDeInteracao = 0;
                for(int y = 0; y < QntDeInteracao;  y++){
                    if(matriz[x][QntDeInteracao] = 1){
                    
                        
                    }
                }
                }
            }
            
            
        } catch (Exception e) {
            // Em caso de exceção, definimos transformaEmStr como uma mensagem de erro
            transformaEmStr = "Erro inesperado: " + e.getMessage();
        }
    }

    /**
     * Método para retornar o conteúdo do arquivo ou a mensagem de erro como uma string.
     */
    public int[] getConteudoArquivo() {
    return grafo; /*retorna o valor final para ser apresentado na tela.*/
                  /*pode ser interessante retornar um txt invés de print*/
}}
