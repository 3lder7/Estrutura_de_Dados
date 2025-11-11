package ComAPI;

import java.util.*;

public class Pacientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        int opcao;
        do {
            System.out.println("\n===== ATENDIMENTO MÉDICO =====");
            System.out.println("1 - Inserir paciente");
            System.out.println("2 - Atender paciente");
            System.out.println("3 - Verificar se há paciente");
            System.out.println("4 - Indicar próximo paciente");
            System.out.println("5 - Quantidade de pacientes aguardando");
            System.out.println("6 - Exibir fila completa");
            System.out.println("7 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do paciente: ");
                    fila.offer(sc.nextLine());
                }

                case 2 -> {
                    String atendido = fila.poll();
                    if (atendido == null)
                        System.out.println("Nenhum paciente para atender.");
                    else
                        System.out.println("Atendendo " + atendido);
                }

                case 3 -> System.out.println(fila.isEmpty()
                        ? "Não há pacientes."
                        : "Há pacientes aguardando.");

                case 4 -> {
                    String proximo = fila.peek();
                    System.out.println(proximo == null
                            ? "Nenhum paciente na fila."
                            : "Próximo paciente: " + proximo);
                }

                case 5 -> System.out.println("Pacientes aguardando: " + fila.size());

                case 6 -> {
                    if (fila.isEmpty())
                        System.out.println("Fila vazia!");
                    else
                        fila.forEach(System.out::println);
                }

                case 7 -> System.out.println("Encerrando o sistema...");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        sc.close();
    }
}
