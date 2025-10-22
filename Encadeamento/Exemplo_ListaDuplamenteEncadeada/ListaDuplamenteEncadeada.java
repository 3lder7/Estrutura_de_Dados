package Estrutura_de_Dados.Encadeamento.Exemplo_ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {
    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // Adicionar no início
    public void adicionarInicio(String valor) {
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        
        if (tamanho == 0) {
            inicio = novoNodo;
            fim = novoNodo;
        } else {
            novoNodo.setProximo(inicio);
            inicio.setAnterior(novoNodo);
            inicio = novoNodo;
        }
        tamanho++;
    }

    // Adicionar no fim
    public void adicionarFim(String valor) {
        Nodo novoNodo = new Nodo();
        novoNodo.setDado(valor);
        
        if (tamanho == 0) {
            inicio = novoNodo;
            fim = novoNodo;
        } else {
            fim.setProximo(novoNodo);
            novoNodo.setAnterior(fim);
            fim = novoNodo;
        }
        tamanho++;
    }

    // Remover do início
    public String removerInicio() {
        if (tamanho == 0) return null;
        
        String valorRemovido = inicio.getDado();
        
        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.getProximo();
            inicio.setAnterior(null);
        }
        tamanho--;
        return valorRemovido;
    }

    // Remover do fim
    public String removerFim() {
        if (tamanho == 0) return null;
        
        String valorRemovido = fim.getDado();
        
        if (tamanho == 1) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.getAnterior();
            fim.setProximo(null);
        }
        tamanho--;
        return valorRemovido;
    }

    // Listar todos os elementos
    public void listarTodos() {
        if (tamanho == 0) {
            System.out.println("A lista está vazia.");
            return;
        }
        
        Nodo atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    // Verificar se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }
}
