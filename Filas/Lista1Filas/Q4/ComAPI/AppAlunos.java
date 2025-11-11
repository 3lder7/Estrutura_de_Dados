package ComAPI;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class AppAlunos {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ordena do mais novo para o mais velho
        Queue<Aluno> fila = new PriorityQueue<>(Comparator.comparingInt(Aluno::getIdade));

        int opcao;
        do {
            System.out.println("\n===== SALA DE AULA =====");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Consultar alunos (por idade)");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    fila.offer(new Aluno(nome, idade));
                    System.out.println("Aluno inserido!");
                }

                case 2 -> {
                    if (fila.isEmpty()) {
                        System.out.println("Nenhum aluno na fila.");
                    } else {
                        System.out.println("\n=== Alunos (mais novos primeiro) ===");
                        fila.stream()
                            .sorted(Comparator.comparingInt(Aluno::getIdade))
                            .forEach(System.out::println);
                    }
                }

                case 3 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
