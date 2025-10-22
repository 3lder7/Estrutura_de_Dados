package Estrutura_de_Dados.Encadeamento.Duplamente_Encadeada_04.Q2;

import java.util.Scanner;

public class App {
       public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ListaSimples L1 = new ListaSimples();
        ListaSimples L2 = new ListaSimples();
        ListaSimples L3 = new ListaSimples();
        
        System.out.println("=== Programa de Interseção de Listas ===");
        
        // ler L1
        System.out.print("Nomes para a primeira lista (L1): ");
        int n1 = kb.nextInt();
        kb.nextLine();  // Consumir newline
        System.out.println("Digite os " + n1 + " nomes para L1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = kb.nextLine().trim();
            if (!nome.isEmpty()) {
                L1.inserirFinal(nome);
            }
        }

        // ler L2
        System.out.print("Nomes para a segunda lista (L2): ");
        int n2 = kb.nextInt();
        kb.nextLine();//limpa buffer
        System.out.println("Digite os " + n2 + " nomes para L2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = kb.nextLine().trim();
            if (!nome.isEmpty()) {
                L2.inserirFinal(nome);
            }
        }

        // percorrer L1 e verificar se cada nome está em L2
        Nodo atualL1 = L1.getInicio();
        while (atualL1 != null) {
            String nome = atualL1.getDado();
            if (L2.contem(nome)) {
                // verificar se já foi adicionado em L3
                if (!L3.contem(nome)) {
                    L3.inserirFinal(nome);
                }
            }
            atualL1 = atualL1.getProximo();
        }
        
        // exibir L3
        System.out.println("\nLista resultante (L3 - nomes comuns):");
        L3.exibir();
        
        kb.close();
    }
}

