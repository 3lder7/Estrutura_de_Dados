package Arvore.AtvAvaliativa.Q2;

import java.util.Scanner;

public class AppCarros {
    public static void main(String[] args) {
        FilaCarros fila = new FilaCarros();
        PilhaCarros pilha = new PilhaCarros();
        Scanner scanner = new Scanner(System.in);
        char opcao;

        System.out.println("=== GERENCIADOR DE CARROS ===");
        System.out.println("Fabricantes: T (Toyota), G (GM), F (Fiat), V (VW)");

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("I - Inserir novo carro");
            System.out.println("F - Listar Fila (não Toyota)");
            System.out.println("P - Listar Pilha (Toyota)");
            System.out.println("S - Sair do programa");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextLine().toUpperCase().charAt(0);

            switch (opcao) {
                case 'I':
                    inserirCarro(fila, pilha, scanner);
                    break;

                case 'F':
                    fila.listar();
                    break;

                case 'P':
                    pilha.listar();
                    break;

                case 'S':
                    System.out.println("\nSaindo do programa...");
                    System.out.println("Obrigado por usar o Gerenciador de Carros!");
                    break;

                default:
                    System.out.println("\nOpção inválida! Por favor, escolha I, F, P ou S.");
            }

        } while (opcao != 'S');

        scanner.close();
    }

    //inserir um novo carro
    private static void inserirCarro(FilaCarros fila, PilhaCarros pilha, Scanner scanner) {
        System.out.println("\n=== INSERIR NOVO CARRO ===");

        // Solicita o nome do carro
        System.out.print("Digite o nome do carro: ");
        String nome = scanner.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("Erro: O nome do carro não pode estar vazio!");
            return;
        }

        // Solicita o fabricante
        System.out.print("Digite o fabricante (T=Toyota, G=GM, F=Fiat, V=VW): ");
        String fabricanteInput = scanner.nextLine().toUpperCase();

        if (fabricanteInput.isEmpty()) {
            System.out.println("Erro: O fabricante não pode estar vazio!");
            return;
        }

        char fabricante = fabricanteInput.charAt(0);

        //fabricante é válido
        if (fabricante != 'T' && fabricante != 'G' && fabricante != 'F' && fabricante != 'V') {
            System.out.println("Erro: Fabricante inválido! Use T, G, F ou V.");
            return;
        }

        // Insere na estrutura correta conforme o fabricante
        if (fabricante == 'T') {
            pilha.empilhar(nome, fabricante);
            System.out.println("Carro Toyota inserido na PILHA: " + nome);
        } else {
            fila.inserir(nome, fabricante);
            System.out.println("Carro " + getFabricanteCompleto(fabricante) +
                    " inserido na FILA: " + nome);
        }
    }

    // Método auxiliar para obter o nome completo do fabricante
    private static String getFabricanteCompleto(char fabricante) {
        switch (fabricante) {
            case 'G':
                return "GM";
            case 'F':
                return "Fiat";
            case 'V':
                return "VW";
            default:
                return "Desconhecido";
        }
    }
}
