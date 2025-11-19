package Arvore.AtvAvaliativa.Q4;

public class Fila {
    private NoPilhaFila inicio;
    private NoPilhaFila fim;
    
    public Fila() {
        this.inicio = null;
        this.fim = null;
    }
    
    // inserir na fila
    public void inserir(int valor) {
        NoPilhaFila novoNo = new NoPilhaFila(valor);
        
        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
    }
    
    //listar a fila
    public void listar() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        
        System.out.print("Fila (números ímpares): ");
        NoPilhaFila atual = inicio;
        
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
    
    //fila está vazia
    public boolean vazia() {
        return inicio == null;
    }
    
    //tamanho da fila
    public int getTamanho() {
        int tamanho = 0;
        NoPilhaFila atual = inicio;
        
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }
}
