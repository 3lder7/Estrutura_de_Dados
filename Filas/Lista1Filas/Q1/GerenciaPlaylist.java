import java.util.Scanner;

public class GerenciaPlaylist {
    public static void main(String[] args) {
        FilaDinamica<String> playlist = new FilaDinamica<>();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\n--- Gerenciador de Playlist ---");
            System.out.println("a) Inserir música");
            System.out.println("b) Consultar música");
            System.out.println("c) Remover música");
            System.out.println("d) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine().toLowerCase();

            switch (opcao) {
                case "a":
                    System.out.print("Digite o nome da música a inserir: ");
                    String musicaInserir = scanner.nextLine();
                    playlist.offer(musicaInserir);
                    System.out.println("Música '" + musicaInserir + "' inserida na playlist.");
                    break;

                case "b":
                    System.out.print("Digite o nome da música a consultar: ");
                    String musicaConsultar = scanner.nextLine();
                    try {
                        boolean encontrada = playlist.consultar(musicaConsultar);
                        if (encontrada) {
                            System.out.println("Música '" + musicaConsultar + "' está na playlist.");
                        } else {
                            System.out.println("Música '" + musicaConsultar + "' não está na playlist.");
                        }
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "c":
                    try {
                        String musicaRemovida = playlist.poll();
                        System.out.println("Música '" + musicaRemovida + "' removida da playlist.");
                    } catch (FilaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "d":
                    System.out.println("Saindo do gerenciador de playlist.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!opcao.equals("d"));

        scanner.close();
    }
}
