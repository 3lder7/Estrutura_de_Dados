package Arvore.AtvAvaliativa.Q2;

public class FilaCarros {
    private Carro inicio;
    private Carro fim;
    
    public FilaCarros() {
        this.inicio = null;
        this.fim = null;
    }
    
    //inserir carro na fila
    public void inserir(String nome, char fabricante) {
        Carro novoCarro = new Carro(nome, fabricante);
        
        if (vazia()) {
            inicio = novoCarro;
            fim = novoCarro;
        } else {
            fim.setProximo(novoCarro);
            fim = novoCarro;
        }
    }
    
    // listar a fila
    public void listar() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        
        System.out.println("\n=== FILA DE CARROS (NÃO TOYOTA) ===");
        Carro atual = inicio;
        int posicao = 1;
        
        while (atual != null) {
            System.out.println(posicao + ". " + atual.toString());
            atual = atual.getProximo();
            posicao++;
        }
    }
    
    //fila está vazia
    public boolean vazia() {
        return inicio == null;
    }
}
