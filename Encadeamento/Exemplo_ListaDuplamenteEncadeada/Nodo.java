package Encadeamento.Exemplo_ListaDuplamenteEncadeada;
public class Nodo {
    public Nodo anterior = null;
    public String dado;
    public Nodo proximo = null;
    
    public Nodo getAnterior() {
        return anterior;
    }
    
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public String getDado() {
        return dado;
    }
    
    public void setDado(String dado) {
        this.dado = dado;
    }
    
    public Nodo getProximo() {
        return proximo;
    }
    
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
