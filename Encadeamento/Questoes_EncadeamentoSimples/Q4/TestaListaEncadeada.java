package Encadeamento.Questoes_EncadeamentoSimples.Q4;

import java.util.Scanner;

public class TestaListaEncadeada {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();

        for (int i = 1; i <= 15; i++) {
            lista.adicionar(i * 10);
        }

        System.out.println("Lista de números:");
        lista.listarRegistros();

        System.out.print("\nDigite um número para buscar sua posição: ");
        int numero = kb.nextInt();

        int posicao = lista.buscarPosicaoRecursivo(numero);
        if (posicao != -1) {
            System.out.println("O número " + numero + " está na posição: " + posicao);
        } else {
            System.out.println("O número " + numero + " não foi encontrado na lista.");
        }

        kb.close();
    }
}
