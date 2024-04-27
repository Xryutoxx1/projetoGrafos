//https://www.youtube.com/watch?v=60C_LhXtrMU

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class LerArquivo{

        public static void main(String[] Args){
            Scanner scanner =  new Scanner(System.in);

            // criar um loop que pode ser fechado digitando 0 clicando no 'x'
            System.out.println("Digite o nome do arquivo");
            String nomeArquivo = scanner.nextLine();

            Path caminho = Paths.get("C:\\Users\\lucas\\Desktop\\codigos\\projeto tenorio\\" +  nomeArquivo + ".txt");
            //as funções file pedem para utilizar um try catch obrigatoriamente
            try{
                byte[] bytesDoArquivo = Files.readAllBytes(caminho);
                String conteudoDoArquivo = new String(bytesDoArquivo);
                System.out.println("Conteudo do arquivo:");
                System.out.println(conteudoDoArquivo);

                //transformar os numeros em um vetor de inteiros
                String[] transformaStrEmInt = conteudoDoArquivo.split("\\s+"); //divide a string utilizando espaços como parametro
                int[] grafo = new int[transformaStrEmInt.length]; //criando um vetor do tamanho de transformaStrEmInt
                


                for(int i = 0; i < transformaStrEmInt.length; i++){
                    grafo[i] = Integer.parseInt(transformaStrEmInt[i]); //Transporta os STR para o novo vetor e transforma em INT
                }

                
                //vai haver um loop for(){} para iterar sobre todos os numeros dentro do txt e
                //fazer oq deve ser feito.
                for(int x = 0; x < grafo.length; x++){
                    System.out.println("qm ler é corno");
                }

            }
            catch (Exception e){System.out.println("Erro inesperado: " + e.getMessage());}
        }

    
}