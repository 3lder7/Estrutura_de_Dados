package Arvore.AtvAvaliativa.Q3;

import java.util.Scanner;

public class AppTarefas {
    public static void main(String[] args) {
        FilaTarefas fila = new FilaTarefas();
        Scanner kb = new Scanner(System.in);
        int opcao;

        System.out.println("=== GERENCIADOR DE FILA DE TAREFAS ===");

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Inserir tarefa na FILA");
            System.out.println("2. Obter próxima tarefa da FILA");
            System.out.println("3. Exibir todas as tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            if (kb.hasNextInt()) {
                opcao = kb.nextInt();
                kb.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("\nDigite a descrição da tarefa: ");
                        String descricao = kb.nextLine();

                        if (descricao.trim().isEmpty()) {
                            System.out.println("Erro: A descrição da tarefa não pode estar vazia!");
                        } else {
                            fila.inserirTarefa(descricao);
                        }
                        break;

                    case 2:
                        if (fila.filaVazia()) {
                            System.out.println("\nA fila de tarefas está vazia!");
                        } else {
                            String proximaTarefa = fila.obterProximaTarefa();
                            System.out.println("\n=== PRÓXIMA TAREFA ===");
                            System.out.println("Tarefa: " + proximaTarefa);
                            System.out.println("Tarefas restantes: " + fila.getTamanho());
                        }
                        break;

                    case 3:
                        fila.exibirFila();
                        break;

                    case 4:
                        System.out.println("\nSaindo do programa...");
                        System.out.println("Obrigado por usar o Gerenciador de Tarefas!");
                        break;

                    default:
                        System.out.println("\nOpção inválida! Por favor, escolha uma opção entre 1 e 4.");
                }
            } else {
                System.out.println("\nErro: Por favor, digite um número válido!");
                kb.next(); // Limpa o buffer
                opcao = 0;
            }

        } while (opcao != 4);

        kb.close();
    }
}