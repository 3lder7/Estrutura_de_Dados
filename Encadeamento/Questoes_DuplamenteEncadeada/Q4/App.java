package Estrutura_de_Dados.Encadeamento.Duplamente_Encadeada_04.Q4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        System.out.println("=== Programa de Lista Duplamente Encadeada com Números Ímpares ===");
        
        //preencher
        lista.popularComImpares();
        
        System.out.println("\nLista inicial:");
        lista.listar();
        int opcao;
            do {
                System.out.println("\n=== Menu de Funcionalidades ===");
                System.out.println("a) Inserir no início (digite um número ímpar)");
                System.out.println("b) Inserir no fim (digite um número ímpar)");
                System.out.println("c) Remover no início");
                System.out.println("d) Remover no fim");
                System.out.println("e) Listar todos da lista");
                System.out.println("0) Sair");
                System.out.print("Escolha uma opção: ");
                opcao = kb.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite um número ímpar para inserir no início: ");
                        int valorInicio = kb.nextInt();
                        kb.nextLine();  // Consumir newline
                        if (valorInicio % 2 == 0) {
                            System.out.println("Atenção: Número par inserido, mas a lista é para ímpares!");
                        }
                        lista.inserirInicio(valorInicio);
                        break;
                        
                    case 2:
                        System.out.print("Digite um número ímpar para inserir no fim: ");
                        int valorFim = kb.nextInt();
                        kb.nextLine();  // Consumir newline
                        if (valorFim % 2 == 0) {
                            System.out.println("Atenção: Número par inserido, mas a lista é para ímpares!");
                        }
                        lista.inserirFim(valorFim);
                        break;
                        
                    case 3:
                        lista.removerInicio();
                        break;
                        
                    case 4:
                        lista.removerFim();
                        break;
                        
                    case 5:
                        lista.listar();
                        break;
                        
                    case 6:
                        System.out.println("Saindo do programa...");
                        break;
                        
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } while (opcao != 6);
            kb.close();
    }
}
