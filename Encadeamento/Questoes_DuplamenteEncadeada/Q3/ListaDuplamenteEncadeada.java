package Estrutura_de_Dados.Encadeamento.Duplamente_Encadeada_04.Q3;

public class ListaDuplamenteEncadeada{
    private Nodo inicio = null;  
    private Nodo fim = null;     
    
    // inserie no final
    public void inserirFinal(Aluno aluno) {
        Nodo novo = new Nodo(aluno);
        
        if (fim == null) {
            // Lista vazia
            inicio = fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }
    
    // inserir no inicio
    public void inserirInicio(Aluno aluno) {
        Nodo novo = new Nodo(aluno);
        
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    //exibir lista
    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        
        Nodo atual = inicio;
        System.out.println("=== Lista de Alunos ===");
        int indice = 1;
        while (atual != null) {
            System.out.println(indice + ". " + atual.getDado().toString());
            atual = atual.getProximo();
            indice++;
        }
        System.out.println("======================");
    }

    public boolean estaVazia() {
        return inicio == null;
    }
}