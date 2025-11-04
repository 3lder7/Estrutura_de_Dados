public class PilhaEstatica<T> {
    private No<T> topo;
    private int tamanho;
    
    public PilhaEstatica() {
        this.topo = null;
        this.tamanho = 0;
    } 
    
    //Obtem o topo da pilha
    public T getTopo() throws PilhaVaziaException {
        if(isVazia()){
            throw new PilhaVaziaException("A pilha está vazia");
        }
        return this.topo.getElemento();
    }

    // Inserir na Pilha
    public void push(T elemento){
        No<T> novo = new No<T>(elemento);
        novo.setProximo(this.topo);
        this.topo = novo;
        this.tamanho++;
    }
    
    // Verificar se está vazia
    public boolean isVazia(){
        return this.topo == null;
    }
    
    // Remover da Pilha
    public T pop() throws PilhaVaziaException { 
        if(this.isVazia()){
            throw new PilhaVaziaException();
        }  
        T elem = this.topo.getElemento(); 
        this.topo = this.topo.getProximo();
        this.tamanho--;
        return elem; 
    }
    
    // Consultar na Pilha
    public boolean consultar(T elemento) {
        No<T> atual = this.topo;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    
    //Consulta com listagem
    public void buscar(T elemento) {
       No<T> atual = this.topo;
       while (atual != null) {
           if (atual.getElemento().equals(elemento)) {
               System.out.println("Elemento '" + elemento + "' encontrado na estrutura.");
               return;
           }
           atual = atual.getProximo();
       }
       System.out.println("Elemento '" + elemento + "' não encontrado na estrutura.");
    }

    // Esvaziar a Pilha
    public void esvaziar(){
        this.topo = null;
        this.tamanho = 0;
    }
    
    // Verificar tamanho
    public int verificarTamanho(){
        return this.tamanho;
    }
    
    // Listar elementos padrão
    public void listar() {
        System.out.println("Elementos da pilha:");
        No<T> atual = this.topo;
        int posicao = 1;
        
        while(atual != null) {
            System.out.println("Posição " + posicao + ": " + atual.getElemento());
            atual = atual.getProximo();
            posicao++;
        }
    }
    
    // Listar recursivo
    public void listarR() {
        System.out.println("Elementos da pilha (ordem de inserção):");
        listarRecursivo(this.topo, 1);
    }
    
    private void listarRecursivo(No<T> atual, int posicao) {
        if(atual == null) return;
        
        listarRecursivo(atual.getProximo(), posicao + 1);
        
        System.out.println("Posição " + posicao + ": " + atual.getElemento());
    }
}