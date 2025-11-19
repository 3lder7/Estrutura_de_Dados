package Arvore.AtvAvaliativa.Q2;

public class Carro {
    private String nome;
    private char fabricante;
    private Carro proximo;
    
    public Carro(String nome, char fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.proximo = null;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public char getFabricante() {
        return fabricante;
    }
    
    public void setFabricante(char fabricante) {
        this.fabricante = fabricante;
    }
    
    public Carro getProximo() {
        return proximo;
    }
    
    public void setProximo(Carro proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public String toString() {
        return nome + " (" + fabricante + ")";
    }
}
