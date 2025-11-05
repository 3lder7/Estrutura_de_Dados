package Encadeamento.Questoes_DuplamenteEncadeada.Q3;

public class Nodo {
    public Nodo anterior = null;
    public Aluno dado;  
    public Nodo proximo = null;
    
    public Nodo(Aluno dado) {
        this.dado = dado;
    }
    
    public Nodo getAnterior() {
        return anterior;
    }
    
    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    public Aluno getDado() {
        return dado;
    }
    
    public void setDado(Aluno dado) {
        this.dado = dado;
    }
    
    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
