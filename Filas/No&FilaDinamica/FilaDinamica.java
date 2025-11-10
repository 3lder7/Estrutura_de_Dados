public class FilaDinamica<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;
    
    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    public boolean isVazia(){
        return this.inicio == null;    
    }
    
    public int getTamanho() {
        return this.tamanho;
    }
    
    public void offer(T elemento) {
        No<T> novo = new No<T>(elemento);
        
        if (this.isVazia()) {
            this.inicio = this.fim = novo;
        } else {
            this.fim.setProximo(novo);
            this.fim = novo;
        }
        this.tamanho++;
    }
    
    public T poll() throws FilaVaziaException {
        if (this.isVazia()) {
            throw new FilaVaziaException("A fila está vazia");
        }
        
        T elemento = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        
        if (this.inicio == null) {
            this.fim = null;
        }
        
        this.tamanho--;
        return elemento;
    }
    
    public T inicioDaFila() throws FilaVaziaException {
        if (this.isVazia()) {
            throw new FilaVaziaException("A fila está vazia");
        }
        return this.inicio.getElemento();
    }
    
      public boolean consultar(T elemento) throws FilaVaziaException {
         if (this.isVazia()) {
             throw new FilaVaziaException("A fila está vazia! Tente adicionar um elemento, antes de consultar");
        }
        
        No<T> atual = this.inicio;
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    
     public void listar() throws FilaVaziaException {
        if (this.isVazia()) {
             throw new FilaVaziaException("A fila está vazia! Tente adicionar um elemento, antes de exibir");
            return;
        }
        
        No<T> atual = this.inicio;
        System.out.print("Fila: ");
        while (atual != null) {
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
}