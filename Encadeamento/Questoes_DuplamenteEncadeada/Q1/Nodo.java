package Encadeamento.Questoes_DuplamenteEncadeada.Q1;

 public class Nodo {
    public Nodo anterior = null;
    public int dado; 
    public Nodo proximo = null;
    
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
