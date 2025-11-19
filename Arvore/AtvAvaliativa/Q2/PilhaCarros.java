package Arvore.AtvAvaliativa.Q2;

public class PilhaCarros {
    private Carro topo;
    
    public PilhaCarros() {
        this.topo = null;
    }
    
    //empilhar carro
    public void empilhar(String nome, char fabricante) {
        Carro novoCarro = new Carro(nome, fabricante);
        novoCarro.setProximo(topo);
        topo = novoCarro;
    }
    
    //listar a pilha
    public void listar() {
        if (vazia()) {
            System.out.println("Pilha vazia!");
            return;
        }
        
        System.out.println("\n=== PILHA DE CARROS TOYOTA ===");
        Carro atual = topo;
        int posicao = 1;
        
        while (atual != null) {
            System.out.println(posicao + ". " + atual.toString());
            atual = atual.getProximo();
            posicao++;
        }
    }
    
    //pilha está vazia
    public boolean vazia() {
        return topo == null;
    }
}
