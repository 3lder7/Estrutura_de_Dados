package Encadeamento.Exemplo_ListaDuplamenteEncadeada;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        int opcao;
        String valor;

        do {
            System.out.println("\n=== MENU LISTA DUPLAMENTE ENCADEADA ===");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Listar Todos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1: // Adicionar
                    System.out.print("Digite o valor a ser adicionado: ");
                    valor = scanner.nextLine();
                    System.out.print("Adicionar no [1] Início ou [2] Fim? ");
                    int posicao = scanner.nextInt();
                    scanner.nextLine();
                    if (posicao == 1) {
                        lista.adicionarInicio(valor);
                        System.out.println("Valor '" + valor + "' adicionado no início.");
                    } else if (posicao == 2) {
                        lista.adicionarFim(valor);
                        System.out.println("Valor '" + valor + "' adicionado no fim.");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2: // Remover
                    if (lista.estaVazia()) {
                        System.out.println("A lista está vazia. Nada para remover.");
                    } else {
                        System.out.print("Remover do [1] Início ou [2] Fim? ");
                        int removerPos = scanner.nextInt();
                        scanner.nextLine();
                        String removido;
                        if (removerPos == 1) {
                            removido = lista.removerInicio();
                            System.out.println("Valor removido do início: " + removido);
                        } else if (removerPos == 2) {
                            removido = lista.removerFim();
                            System.out.println("Valor removido do fim: " + removido);
                        } else {
                            System.out.println("Opção inválida!");
                        }
                    }
                    break;

                case 3: // Listar Todos
                    lista.listarTodos();
                    break;

                case 4: // Sair
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
