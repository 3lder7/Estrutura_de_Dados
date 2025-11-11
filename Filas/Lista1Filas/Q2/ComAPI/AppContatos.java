package ComAPI;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AppContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Contato> fila = new LinkedList<>();

        int opcao;

        do {
            System.out.println("\n===== CALL CENTER =====");
            System.out.println("1 - Inserir Contato");
            System.out.println("2 - Próximo Contato");
            System.out.println("3 - Exibir todos os contatos na fila");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("E-mail: ");
                    String email = sc.nextLine();

                    fila.offer(new Contato(nome, telefone, email));
                    System.out.println("Contato adicionado!");
                }

                case 2 -> {
                    Contato contato = fila.poll();
                    if (contato == null)
                        System.out.println("Fila vazia!");
                    else
                        System.out.println("Atendendo -> " + contato);
                }

                case 3 -> {
                    if (fila.isEmpty())
                        System.out.println("Nenhum contato na fila.");
                    else
                        fila.forEach(System.out::println);
                }

                case 4 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}