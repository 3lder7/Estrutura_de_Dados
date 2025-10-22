package Estrutura_de_Dados.Encadeamento.ListaEncadeada_Angela_3.Q1;

import java.util.Scanner;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();

		String menu = 
				"============ Menu =================\n"
				+ "(1) Adicionar Professores\n"
				+ "(2) Remover Professores\n"
				+ "(3) Verificar o tamanho da Lista\n"
				+ "(4) Verificar se a lista está vazia\n"
				+ "(5) Apagar a lista\n"
				+ "(6) Listar os registros da lista\n"
				+ "(0) Finaliza Operação\n"
				+ "====================================\n";
		int op;

		do {
			System.out.println(menu);
			op = kb.nextInt();

			switch (op) {
			case 1:
				System.out.println("Você tem os seguintes Professores adicionados: ");
				
				testaListaEncadeada.addProfessor(listaEncadeada);
				while (listaEncadeada.temProximo()) {
					System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
				}
				
				break;
			case 2: 
				
				System.out.println("Professores removidos");
				
				testaListaEncadeada.removerProfessor(listaEncadeada);
				while (listaEncadeada.temProximo()) {
					System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
				}
				
				break;
			case 3:
				System.out.println("Tamanho da lista: " + listaEncadeada.verificarTamanho());
				
				break;
			case 4:
				
				System.out.println("Resposta: "+listaEncadeada.estaVazia());
				
				break;
			case 5:
				listaEncadeada.apagarLista();
				
				break;
			case 6:
				listaEncadeada.listarRegistros();
				
				break;
			default:
				System.out.println("Operação encerrada!");
			}

		} while (op != 0);
		
		kb.close();
	}

	public void addProfessor(ListaEncadeada listaEncadeada) {
		Professor professor1 = new Professor("Angela");
		Professor professor2 = new Professor("Chris");
		Professor professor3 = new Professor("Sema");
		Professor professor4 = new Professor("Marla");

		listaEncadeada.adicionar(professor1);
		listaEncadeada.adicionar(professor2);
		listaEncadeada.adicionar(professor3);
		listaEncadeada.adicionar(professor4);
	}

	public void removerProfessor(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
	}

}