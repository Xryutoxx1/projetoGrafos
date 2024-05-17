
package projeto.projetografos;

public class Aresta {
    // Variáveis para armazenar os índices das arestas
    private int aresta_esquerda;
    private int aresta_direita;

    // Construtor da classe Aresta que inicializa as variáveis de índice das arestas
    public Aresta(int aresta_esquerda, int aresta_direita) {
        // Adiciona 1 aos índices para adequá-los à representação em formato de string do grafo
        this.aresta_esquerda = aresta_esquerda + 1;
        this.aresta_direita = aresta_direita + 1;
    }

    // Método para obter a representação em string de uma aresta
    public String getAresta() {
        // Retorna a representação em formato de string da aresta no formato "A(i,j)"
        return "A(" + aresta_esquerda + "," + aresta_direita + ")";
    }
}