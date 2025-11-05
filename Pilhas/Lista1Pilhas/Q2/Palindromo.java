package Pilhas.Lista1Pilhas.Q2;

import java.util.Scanner;
import java.util.Stack;
public class Palindromo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Digite uma frase para verificar se é um palíndromo: ");
        String entrada = kb.nextLine();

        if (ehPalindromo(entrada)) {
            System.out.println("é um palindromo");
        } else {
            System.out.println("não é um palindromo.");
        }

        kb.close();
    }

    public static boolean ehPalindromo(String texto) {
        //formata string
        String normalizada = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        //pilha criada
        Stack<Character> pilha = new Stack<>();
        //empilhar caracteres
        for (char c : normalizada.toCharArray()) {
            pilha.push(c);
        }
        //monta a string invertida desempilhando os caracteres
        StringBuilder invertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            invertida.append(pilha.pop());
        }

        //compara a string normalizada com a invertida
        return normalizada.equals(invertida.toString());
    }
}
