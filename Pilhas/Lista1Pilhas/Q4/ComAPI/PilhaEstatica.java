package Pilhas.Lista1Pilhas.Q4.ComAPI;

import java.util.Stack;
import java.util.EmptyStackException;

public class PilhaEstatica {
    public static void main(String[] args) {
        Stack<String> historico = new Stack<>();

        try {
            historico.push("https://www.github.com");
            historico.push("https://www.stackoverflow.com");
            historico.push("https://www.reddit.com");

            System.out.println("Página no topo (removida): " + historico.pop());
            System.out.println("Nova página no topo: " + historico.peek());

        } catch (EmptyStackException e) {
            System.out.println("A pilha está vazia. Nenhuma página para remover.");
        }
    }
}
