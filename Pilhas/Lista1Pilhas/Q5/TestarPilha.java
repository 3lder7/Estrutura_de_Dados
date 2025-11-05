package Pilhas.Lista1Pilhas.Q5;

public class TestarPilha {
    public static void main(String[] args) {
        PilhaEstatica pilha = new PilhaEstatica();
        try {
            pilha.push("Tarefa 1");
            pilha.push("Tarefa 2");
            pilha.push("Tarefa 3");

            System.out.println("Desempilhando tarefas:");
            while (!pilha.isVazia()) {
                String tarefa = (String) pilha.pop();
                System.out.println("Executando: " + tarefa);
            }
        } catch (PilhaVaziaException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Pilha vazia: " + pilha.isVazia());
    }
}

class PilhaVaziaException extends Exception {
    public PilhaVaziaException() {
        super("A pilha está vazia");
    }
    public PilhaVaziaException(String mensagem) {
        super(mensagem);
    }
}
