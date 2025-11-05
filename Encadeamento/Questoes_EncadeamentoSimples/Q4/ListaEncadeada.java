package Encadeamento.Questoes_EncadeamentoSimples.Q4;

public class ListaEncadeada {
    private Celula primeiro;
    private Celula ultimo;

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

    // método público que inicia a busca recursiva
    public int buscarPosicaoRecursivo(int numero) {
        return buscarPosicaoAux(primeiro, numero, 1);
    }
    
    // método recursivo auxiliar
    private int buscarPosicaoAux(Celula atual, int numero, int posicao) {
        if (atual == null) {
            return -1; // não encontrado
        }
        if (atual.getValor() == numero) {
            return posicao;
        }
        return buscarPosicaoAux(atual.getProximo(), numero, posicao + 1);
    }
}
