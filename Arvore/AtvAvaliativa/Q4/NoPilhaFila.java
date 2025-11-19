package Arvore.AtvAvaliativa.Q4;

public class NoPilhaFila {
    private int dado;
    private NoPilhaFila proximo;
    
    public NoPilhaFila(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
    
    public int getDado() {
        return dado;
    }
    
    public void setDado(int dado) {
        this.dado = dado;
    }
    
    public NoPilhaFila getProximo() {
        return proximo;
    }
    
    public void setProximo(NoPilhaFila proximo) {
        this.proximo = proximo;
    }
}