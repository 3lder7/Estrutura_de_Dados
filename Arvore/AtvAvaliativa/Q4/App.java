package Arvore.AtvAvaliativa.Q4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        Scanner kb = new Scanner(System.in);

        System.out.println("=== SISTEMA INTEGRADO: ÁRVORE, PILHA E FILA ===");
        System.out.println("Digite 10 números inteiros:");

        int contador = 0;

        // Recebe 10 números e insere na árvore
        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");

            if (kb.hasNextInt()) {
                int numero = kb.nextInt();

                if (arvore.insere(numero)) {
                    contador++;
                    System.out.println("Número " + numero + " inserido na árvore!");
                } else {
                    System.out.println("Número " + numero + " já existe! Digite outro número.");
                }
            } else {
                System.out.println("Erro: Por favor, digite um número inteiro válido!");
                kb.next(); // Limpa o buffer
            }
        }

        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== RESULTADOS ===");

        // 1. Consulta a árvore em pré-ordem
        arvore.exibePreOrdem();

        // 2. Separa números pares e ímpares usando recursividade
        arvore.separarParesImpares(pilha, fila);

        // 3. Lista os números da fila e pilha
        pilha.listar();
        fila.listar();

        // 4. Estatísticas
        System.out.println("\n=== ESTATÍSTICAS ===");
        System.out.println("Total de números pares na pilha: " + pilha.getTamanho());
        System.out.println("Total de números ímpares na fila: " + fila.getTamanho());

        kb.close();
    }
}
