package Arvore.AtvAvaliativa.Q4;

public class Pilha {
    private NoPilhaFila topo;
    
    public Pilha() {
        this.topo = null;
    }
    
    //empilhar
    public void empilhar(int valor) {
        NoPilhaFila novoNo = new NoPilhaFila(valor);
        novoNo.setProximo(topo);
        topo = novoNo;
    }
    
    //listar a pilha
    public void listar() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        
        System.out.print("Pilha (números pares): ");
        NoPilhaFila atual = topo;
        
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
    
    //pilha está vazia
    public boolean vazia() {
        return topo == null;
    }
    
    //tamanho da pilha
    public int getTamanho() {
        int tamanho = 0;
        NoPilhaFila atual = topo;
        
        while (atual != null) {
            tamanho++;
            atual = atual.getProximo();
        }
        return tamanho;
    }
}
