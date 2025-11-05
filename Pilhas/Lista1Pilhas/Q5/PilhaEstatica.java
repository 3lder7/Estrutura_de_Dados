package Pilhas.Lista1Pilhas.Q5;

public class PilhaEstatica<T> {
    private No<T> topo;
    private int tamanho;
    
    //cria a pilha
    public PilhaEstatica() {
        this.topo = null;
        this.tamanho = 0;
    } 

    // adicionar passos na pilha
    public void push(T elemento){
        No<T> novo = new No<T>(elemento);
        novo.setProximo(this.topo);
        this.topo = novo;
        this.tamanho++;
    }
    
    // remover passos da pilha
    public T pop() throws PilhaVaziaException { 
        if(this.isVazia()){
            throw new PilhaVaziaException();
        }  
        T elem = this.topo.getElemento(); 
        this.topo = this.topo.getProximo();
        this.tamanho--;
        return elem; 
    }

    // Verificar se está vazia
    public boolean isVazia(){
        return this.topo == null;
    }
}