package Estrutura_de_Dados.Encadeamento.Duplamente_Encadeada_04.Q1;

public class App {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        System.out.println("=== Demonstração da Lista Duplamente Encadeada ===");
        
        lista.inserirEsquerda(10);
        lista.inserirEsquerda(20);
        lista.exibir();
        
        lista.inserirDireita(30);
        lista.inserirDireita(40);
        lista.exibir(); 
        
        lista.inserirEsquerda(5);
        lista.inserirDireita(50);
        lista.exibir();  
        
        ListaDuplamenteEncadeada listaVazia = new ListaDuplamenteEncadeada();
        listaVazia.exibir();  
        
    }
}

