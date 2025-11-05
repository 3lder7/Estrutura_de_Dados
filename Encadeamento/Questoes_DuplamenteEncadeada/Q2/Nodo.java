package Encadeamento.Questoes_DuplamenteEncadeada.Q2;

public class Nodo {
    public String dado;  // Nome da pessoa (String)
    public Nodo proximo = null;
    
    // Construtor
    public Nodo(String dado) {
        this.dado = dado;
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
