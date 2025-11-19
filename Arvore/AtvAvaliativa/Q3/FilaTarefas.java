package Arvore.AtvAvaliativa.Q3;

public class FilaTarefas {
    private Tarefa inicio;
    private Tarefa fim;
    private int tamanho;
    
    public FilaTarefas() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }
    
    // inserir tarefa na fila
    public void inserirTarefa(String descricao) {
        Tarefa novaTarefa = new Tarefa(descricao);
        
        if (filaVazia()) {
            inicio = novaTarefa;
            fim = novaTarefa;
        } else {
            fim.setProxima(novaTarefa);
            fim = novaTarefa;
        }
        tamanho++;
        System.out.println("Tarefa adicionada: \"" + descricao + "\"");
    }
    
    // obter a próxima tarefa da fila
    public String obterProximaTarefa() {
        if (filaVazia()) {
            return "Não há tarefas na fila!";
        }
        
        Tarefa tarefaRemovida = inicio;
        inicio = inicio.getProxima();
        tamanho--;
        
        //fila ficou vazia após remoção
        if (inicio == null) {
            fim = null;
        }
        
        return tarefaRemovida.getDescricao();
    }
    
    //exibir todas as tarefas na fila
    public void exibirFila() {
        if (filaVazia()) {
            System.out.println("A fila de tarefas está vazia!");
            return;
        }
        
        System.out.println("\n=== TAREFAS NA FILA ===");
        Tarefa atual = inicio;
        int posicao = 1;
        
        while (atual != null) {
            System.out.println(posicao + ". " + atual.getDescricao());
            atual = atual.getProxima();
            posicao++;
        }
        System.out.println("Total de tarefas: " + tamanho + "\n");
    }
    
    //se a fila está vazia
    public boolean filaVazia() {
        return inicio == null;
    }
    
    //tamanho da fila
    public int getTamanho() {
        return tamanho;
    }
}
