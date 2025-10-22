package Estrutura_de_Dados.Encadeamento.Duplamente_Encadeada_04.Q2;

public class ListaSimples {
    private Nodo inicio = null;
    
    // inserir no final da lista
    public void inserirFinal(String nome) {
        Nodo novo = new Nodo(nome);
        if (inicio == null) {
            inicio = novo;
        } else {
            Nodo atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novo);
        }
    }
    
    // exibir a lista
    public void exibir() {
        if (inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }

        Nodo atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }
    
    // verificar se um nome existe na lista 
    public boolean contem(String nome) {
        Nodo atual = inicio;
        while (atual != null) {
            if (atual.getDado().equalsIgnoreCase(nome)) {  
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }
    
    // obter o início da lista
    public Nodo getInicio() {
        return inicio;
    }
}
