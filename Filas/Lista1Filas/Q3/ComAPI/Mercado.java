package ComAPI;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Mercado {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao;

        do {
            System.out.println("\n===== SUPERMERCADO =====");
            System.out.println("1 - Inserir cliente");
            System.out.println("2 - Remover cliente");
            System.out.println("3 - Consultar quantidade");
            System.out.println("4 - Exibir fila");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do cliente: ");
                    fila.offer(sc.nextLine());
                }

                case 2 -> {
                    String removido = fila.poll();
                    if (removido == null)
                        System.out.println("Nenhum cliente na fila.");
                    else
                        System.out.println("Cliente atendido: " + removido);
                }

                case 3 -> System.out.println("Clientes na fila: " + fila.size());

                case 4 -> {
                    if (fila.isEmpty())
                        System.out.println("Fila vazia!");
                    else
                        fila.forEach(System.out::println);
                }

                case 5 -> System.out.println("Encerrando...");

                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}