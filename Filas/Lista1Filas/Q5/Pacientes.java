import java.util.Scanner;

public class Pacientes {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaDinamica<String> fila = new FilaDinamica<>();
        int opcao = 0;

        do {
            System.out.println("\n===== SISTEMA DE ATENDIMENTO =====");
            System.out.println("1 - Inserir paciente");
            System.out.println("2 - Atender paciente");
            System.out.println("3 - Verificar se há paciente");
            System.out.println("4 - Indicar o próximo paciente");
            System.out.println("5 - Quantidade de pacientes aguardando");
            System.out.println("6 - Exibir fila completa");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("\nNome do paciente: ");
                    String nome = sc.nextLine();
                    fila.offer(nome);
                    System.out.println("Paciente " + nome + " adicionado à fila!");
                    break;

                case 2:
                    try {
                        String atendido = fila.poll();
                        System.out.println("\nPaciente atendido: " + atendido);
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    if (fila.isVazia()) {
                        System.out.println("\nNão há pacientes na fila.");
                    } else {
                        System.out.println("\nHá pacientes aguardando atendimento.");
                    }
                    break;

                case 4:
                    try {
                        String proximo = fila.inicioDaFila();
                        System.out.println("\nPróximo paciente a ser atendido: " + proximo);
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("\nQuantidade de pacientes aguardando: " + fila.getTamanho());
                    break;

                case 6:
                    try {
                        System.out.println("\n=== Pacientes na fila ===");
                        fila.listar();
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("\nEncerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 7);

        sc.close();
    }
}
