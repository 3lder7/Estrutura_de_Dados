package Pilhas.Lista1Pilhas.Q3;
import java.util.Scanner;
public class Tarefas {
    Scanner kb = new Scanner(System.in);
    private PilhaEstatica<String> pilhaTarefas;

    public Tarefas() {
        pilhaTarefas = new PilhaEstatica<>();
    }
    public static void main(String[] args) {
        Tarefas gerenciador = new Tarefas();
        
        String menu = ""
            + "=== GERENCIADOR DE TAREFAS ===\n"
            + "1) Inserir Tarefa (1)\n"
            + "2) Consultar Próxima Tarefa (2)\n"
            + "Escolha uma opção: ";

        int opcao;
        do {
            System.out.print(menu);
            opcao = gerenciador.kb.nextInt();
            gerenciador.kb.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    gerenciador.insertirTarefa();
                    break;
                case 2:
                    gerenciador.consultarTarefa();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        } while (opcao != 0);
    }

    private void insertirTarefa() {
    System.out.print("Digite a tarefa a ser inserida: ");
    String tarefa = kb.nextLine();
    pilhaTarefas.push(tarefa);
    System.out.println("Tarefa inserida na pilha.");
    }

    private void consultarTarefa() {
    if (pilhaTarefas == null) {
        System.out.println("A pilha de tarefas está vazia.");
    } else {
        try {
            System.out.println("Próxima tarefa: " + pilhaTarefas.getTopo());
        } catch (PilhaVaziaException e) {
            e.printStackTrace();
        }
    }
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

