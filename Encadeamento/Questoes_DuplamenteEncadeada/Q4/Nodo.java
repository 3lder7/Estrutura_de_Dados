package Estrutura_de_Dados.Encadeamento.Duplamente_Encadeada_04.Q4;

public class Nodo {
    public Nodo anterior = null;
    public int dado;
    public Nodo proximo = null;

    public Nodo(int dado) {
        this.dado = dado;
    }
    
    public Nodo getAnterior() {
        return anterior;
    }
    
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public int getDado() {
        return dado;
    }
    
    public void setDado(int dado) {
        this.dado = dado;
    }
    
    public Nodo getProximo() {
        return proximo;
    }
    
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
