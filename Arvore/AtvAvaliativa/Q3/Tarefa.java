package Arvore.AtvAvaliativa.Q3;

public class Tarefa {
    private String descricao;
    private Tarefa proxima;
    
    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.proxima = null;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Tarefa getProxima() {
        return proxima;
    }
    
    public void setProxima(Tarefa proxima) {
        this.proxima = proxima;
    }
}
