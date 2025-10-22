package Estrutura_de_Dados.Encadeamento.ListaEncadeada_Angela_3.Q5;

import java.util.Scanner;

public class TestaListaEncadeada {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();
        int opcao, valor;
        String menu =
                    "============ Menu =================\n"
        		    +"--- MENU ---\n" 
        			+"1 - Inserir no início\n"
        			+"2 - Inserir no fim\n"
        			+"3 - Exibir lista\n"
        			+"0 - Sair\n";

        do {
        	System.out.println(menu);
            opcao =kb.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor: ");
                    valor = kb.nextInt();
                    lista.inserirInicio(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor: ");
                    valor = kb.nextInt();
                    lista.inserirFim(valor);
                    break;
                case 3:
                    lista.exibir();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        kb.close();
    }
}
