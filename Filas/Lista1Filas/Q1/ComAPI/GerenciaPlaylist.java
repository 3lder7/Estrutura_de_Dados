package ComAPI;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GerenciaPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> playlist = new LinkedList<>();

        int opcao;

        do {
            System.out.println("\n===== PLAYLIST DA FESTA DE FIM DE ANO =====");
            System.out.println("1 - Inserir música");
            System.out.println("2 - Consultar músicas na fila");
            System.out.println("3 - Remover música (tocar próxima)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da música: ");
                    String musica = sc.nextLine();
                    playlist.offer(musica);
                    System.out.println(" Música \"" + musica + "\" adicionada à playlist!");
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println(" A playlist está vazia!");
                    } else {
                        System.out.println("\n Músicas na fila de reprodução:");
                        for (String m : playlist) {
                            System.out.println("- " + m);
                        }
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println(" Nenhuma música na fila para tocar!");
                    } else {
                        String proxima = playlist.poll();
                        System.out.println("▶️ Tocando agora: " + proxima);
                    }
                    break;

                case 4:
                    System.out.println(" Encerrando o gerenciador de playlist. Boa festa!");
                    break;

                default:
                    System.out.println(" Opção inválida. Tente novamente!");
            }

        } while (opcao != 4);

        sc.close();
    }
}
