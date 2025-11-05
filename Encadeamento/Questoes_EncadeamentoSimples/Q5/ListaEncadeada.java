package Encadeamento.Questoes_EncadeamentoSimples.Q5;

public class ListaEncadeada {
    private Celula inicio;
    private int tamanho;
    private final int LIMITE = 7;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean cheia() {
        return tamanho >= LIMITE;
    }

    public void inserirInicio(int valor) {
        if (cheia()) {
            System.out.println("Lista cheia! Não é possível inserir.");
            return;
        }
        Celula nova = new Celula(valor);
        nova.proximo = inicio;
        inicio = nova;
        tamanho++;
    }

    public void inserirFim(int valor) {
        if (cheia()) {
            System.out.println("Lista cheia! Não é possível inserir.");
            return;
        }
        inicio = inserirFimRecursivo(inicio, valor);
        tamanho++;
    }

    private Celula inserirFimRecursivo(Celula atual, int valor) {
        if (atual == null) {
            return new Celula(valor);
        }
        atual.proximo = inserirFimRecursivo(atual.proximo, valor);
        return atual;
    }

    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
        } else {
            System.out.print("Lista: ");
            exibirRecursivo(inicio);
            System.out.println();
        }
    }

    private void exibirRecursivo(Celula atual) {
        if (atual != null) {
            System.out.print(atual.valor + " ");
            exibirRecursivo(atual.proximo);
        }
    }
}