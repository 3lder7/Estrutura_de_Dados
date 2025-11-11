import java.util.Scanner;

public class Mercado {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaDinamica<String> fila = new FilaDinamica<>();
        int opcao = 0;

        do {
            System.out.println("\n===== SUPERMERCADO =====");
            System.out.println("1 - Inserir cliente");
            System.out.println("2 - Remover cliente (atender)");
            System.out.println("3 - Consultar quantidade de clientes na fila");
            System.out.println("4 - Exibir fila atual");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consome quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("\nNome do cliente: ");
                    String nome = sc.nextLine();
                    fila.offer(nome);
                    System.out.println("Cliente " + nome + " entrou na fila!");
                    break;

                case 2:
                    try {
                        String atendido = fila.poll();
                        System.out.println("Cliente atendido: " + atendido);
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("\nHá " + fila.getTamanho() + " cliente(s) na fila.");
                    break;

                case 4:
                    try {
                        System.out.println("\n=== Clientes na Fila ===");
                        fila.listar();
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        sc.close();
    }
}
