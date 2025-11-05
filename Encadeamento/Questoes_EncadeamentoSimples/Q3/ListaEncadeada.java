package Encadeamento.Questoes_EncadeamentoSimples.Q3;

public class ListaEncadeada {
    private Celula primeiro;
    private Celula ultimo;

    // adiciona número ao final
    public void adicionar(int valor) {
        Celula celula = new Celula();
        celula.setValor(valor);

        if (primeiro == null && ultimo == null) {
            primeiro = celula;
            ultimo = celula;
        } else {
            ultimo.setProximo(celula);
            ultimo = celula;
        }
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void listarRegistros() {
        if (estaVazia()) {
            System.out.println("A lista está vazia.");
            return;
        }

        Celula atual = primeiro;
        int contador = 1;

        while (atual != null) {
            System.out.println(contador + " -> " + atual.getValor());
            atual = atual.getProximo();
            contador++;
        }
    }

    public int buscarPosicao(int numero) {
        Celula atual = primeiro;
        int posicao = 1;

        while (atual != null) {
            if (atual.getValor() == numero) {
                return posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }

        return -1; //não encontrado
    }
}
