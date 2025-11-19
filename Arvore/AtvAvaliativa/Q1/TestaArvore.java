package Arvore.AtvAvaliativa.Q1;

import java.util.Scanner;

public class TestaArvore {
    	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("=== ÁRVORE BINÁRIA - APENAS NÚMEROS ÍMPARES ===");
		System.out.println("Digite 10 números inteiros:");
		
		int contador = 0;
		
		while (contador < 10) {
			System.out.print("Número " + (contador + 1) + ": ");
			
			if (kb.hasNextInt()) {
				int numero = kb.nextInt();
				
				if (arvore.insere(numero)) {
					contador++;
					System.out.println("Número " + numero + " inserido com sucesso!");
				}
			} else {
				System.out.println("Erro: Por favor, digite um número inteiro!");
				kb.next(); // Limpa o buffer
			}
		}
		
		System.out.println("\n=== RESULTADO FINAL ===");
		arvore.exibePreOrdem();
		
		kb.close();
	}
}
