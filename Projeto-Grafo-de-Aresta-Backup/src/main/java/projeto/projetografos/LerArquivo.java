package projeto.projetografos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LerArquivo {
    
    private int[] grafo;
    private String transformaEmStr;
    private int[][] matriz; // Variável de instância para armazenar a matriz de inteiros

    public LerArquivo(String nomeArquivo) {
        Path caminho = Paths.get("C:\\Users\\david\\OneDrive\\Área de Trabalho\\InterfaceIntegração\\src\\main\\resources\\entradaTxt\\" + nomeArquivo + ".txt");        
        try {
            byte[] bytesDoArquivo = Files.readAllBytes(caminho);
            transformaEmStr = new String(bytesDoArquivo);
            
            String[] transformaStrEmInt = transformaEmStr.split("\\s+");
            grafo = new int[transformaStrEmInt.length];
            for(int i = 0; i < transformaStrEmInt.length; i++){
                grafo[i] = Integer.parseInt(transformaStrEmInt[i]);
            } 
            
            int linhacoluna = (int) Math.sqrt(transformaStrEmInt.length);
            int linhacoluna1 = linhacoluna;
            matriz = new int[linhacoluna][linhacoluna];
            int index = 0;
            
            for(int i =0; i < linhacoluna; i++){
                for(int j = 0; j < linhacoluna1;  j++){
                    matriz[i][j] = grafo[index];
                    index++;
                }
            }
        } catch (IOException e) {
            transformaEmStr = "Erro inesperado: " + e.getMessage();
        }
    }
    
    public String getConteudoArquivo() {
        Conversora conversora = new Conversora();
        return conversora.conversorGrafoDeAresta(matriz);
    }
}
