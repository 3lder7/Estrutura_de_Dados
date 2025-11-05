package Pilhas.Lista1Pilhas.Q3;
public class PilhaEstatica<T> {
    private No<T> topo;
    private int tamanho;
    
    public PilhaEstatica() {
        this.topo = null;
        this.tamanho = 0;
    } 
    
    // Inserir na Pilha
    public void push(T elemento){
        No<T> novo = new No<T>(elemento);
        novo.setProximo(this.topo);
        this.topo = novo;
        this.tamanho++;
    }

    //Obtem o topo da pilha
    public T getTopo() throws PilhaVaziaException {
        if(isVazia()){
            throw new PilhaVaziaException("A pilha está vazia");
        }
        return this.topo.getElemento();
    }

    // Verificar se está vazia
    public boolean isVazia(){
        return this.topo == null;
    }
    
}