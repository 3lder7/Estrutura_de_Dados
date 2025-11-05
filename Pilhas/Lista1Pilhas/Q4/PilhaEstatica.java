package Pilhas.Lista1Pilhas.Q4;

public class PilhaEstatica <T>{
    private No<T> topo; 
    private int tamanho;

    //inicializarPilha
    public PilhaEstatica() {
        this.topo = null;
        this.tamanho = 0;
    }

    //adiciona um novo elemento
    public void push(T elemento){
        No<T> novo = new No<T>(elemento);
        novo.setProximo(this.topo);
        this.topo = novo;
        this.tamanho++;
    }

    //função pop para remover o elemento do topo
    public T pop() throws PilhaVaziaException { 
        if(this.isVazia()){
            throw new PilhaVaziaException();
        }  
        T elem = this.topo.getElemento(); 
        this.topo = this.topo.getProximo();
        this.tamanho--;
        return elem; 
    }

    //verifica se a pilha está vazia
    public boolean isVazia() {
        return this.topo == null;
    }

}
