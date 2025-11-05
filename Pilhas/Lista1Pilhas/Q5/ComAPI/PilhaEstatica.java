package Pilhas.Lista1Pilhas.Q5.ComAPI;

import java.util.Stack;
import java.util.EmptyStackException;

public class PilhaEstatica {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        try {
            pilha.push("Tarefa 1");
            pilha.push("Tarefa 2");
            pilha.push("Tarefa 3");

            System.out.println("Desempilhando tarefas:");
            while (!pilha.isEmpty()) {
                String tarefa = pilha.pop();
                System.out.println("Executando: " + tarefa);
            }
        } catch (EmptyStackException e) {
            System.out.println("A pilha está vazia! Nenhuma tarefa a executar.");
        }

        System.out.println("Pilha vazia: " + pilha.isEmpty());
    }
}

