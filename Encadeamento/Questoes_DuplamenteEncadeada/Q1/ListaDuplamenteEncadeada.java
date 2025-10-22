package Estrutura_de_Dados.Encadeamento.Duplamente_Encadeada_04.Q1;

public class ListaDuplamenteEncadeada {
    private Nodo inicio = null; 
    private Nodo fim = null;    
    
   
    public void inserirEsquerda(int valor) {
        Nodo novo = new Nodo();
        novo.setDado(valor);  
        
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }
    
    public void inserirDireita(int valor) {
        Nodo novo = new Nodo();
        novo.setDado(valor); 
        
        if (fim == null) {
            inicio = fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }
    
    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
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
    
    public boolean estaVazia() {
        return inicio == null;
    }
}

