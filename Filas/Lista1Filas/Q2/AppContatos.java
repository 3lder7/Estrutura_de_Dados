import java.util.Scanner;

public class AppContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaDinamica<Contato> fila = new FilaDinamica<>();

        int opcao = 0;

        do {
            System.out.println("\n===== CALL CENTER =====");
            System.out.println("1 - Inserir Contato");
            System.out.println("2 - Próximo Contato");
            System.out.println("3 - Exibir todos os contatos na fila");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Inserir Contato ===");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.print("E-mail: ");
                    String email = sc.nextLine();

                    Contato contato = new Contato(nome, telefone, email);
                    fila.offer(contato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n=== Próximo Contato ===");
                    try {
                        Contato proximo = fila.poll();
                        System.out.println("Contato a ser atendido:");
                        System.out.println(proximo);
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("\n=== Contatos na Fila ===");
                        fila.listar();
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }

        } while (opcao != 4);

        sc.close();
    }
}