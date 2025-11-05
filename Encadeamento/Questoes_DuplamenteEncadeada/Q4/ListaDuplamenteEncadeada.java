package Encadeamento.Questoes_DuplamenteEncadeada.Q4;

public class ListaDuplamenteEncadeada {
    private Nodo inicio = null;
    private Nodo fim = null;    
    
    // inserir no início
    public void inserirInicio(int valor) {
        Nodo novo = new Nodo(valor);
        
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
        System.out.println("Número " + valor + " inserido no INÍCIO da lista.");
    }

    // inserir no final 
    public void inserirFim(int valor) {
        Nodo novo = new Nodo(valor);
        
        if (fim == null) {
            // Lista vazia
            inicio = fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
        System.out.println("Número " + valor + " inserido no FINAL da lista.");
    }

    // remover do início
    public void removerInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia! Não é possível remover.");
            return;
        }
        
        int valorRemovido = inicio.getDado();
        if (inicio == fim) {
            // Apenas um elemento
            inicio = fim = null;
        } else {
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        }
        System.out.println("Número " + valorRemovido + " REMOVIDO do INÍCIO da lista.");
    }

    // remover do final 
    public void removerFim() {
        if (fim == null) {
            System.out.println("Lista vazia! Não é possível remover.");
            return;
        }
        
        int valorRemovido = fim.getDado();
        if (inicio == fim) {
            // Apenas um elemento
            inicio = fim = null;
        } else {
            fim = fim.getAnterior();
            fim.setProximo(null);
        }
        System.out.println("Número " + valorRemovido + " REMOVIDO do FINAL da lista.");
    }

    //listar tudo
    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        
        System.out.print("Lista de números ímpares: ");
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    //popular a lista com os 15 primeiros números ímpares
    public void popularComImpares() {
        int numero = 1;
        for (int i = 0; i < 15; i++) {
            inserirFim(numero);
            numero += 2; 
        }
        System.out.println("Lista populada com os 15 primeiros números ímpares.");
    }
}
