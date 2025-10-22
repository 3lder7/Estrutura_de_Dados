package Estrutura_de_Dados.Encadeamento.ListaEncadeada_Angela_3.Q2;

import java.util.Scanner;

public class TestaListaEncadeada {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		int op;
		String menu = 
				"============ Menu =================\n"
				+ "(1) Adicionar Alunos\n"
				+ "(2) Remover Alunos\n"
				+ "(3) Pesquisar\n"
				+ "(4) Listar\n"
				+ "(5) Colocar em ordem alfabética\n"
				+ "(0) Finaliza Operação\n"
				+ "====================================\n";
		do {
			System.out.println(menu);
			op = kb.nextInt();
			kb.nextLine();
			switch (op) {
			case 1:
				System.out.println("Você tem os seguintes Alunos adicionados: ");
				testaListaEncadeada.addAlunos(listaEncadeada);
				while (listaEncadeada.temProximo()) {
					System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
				}
				break;
			case 2: 
				System.out.println("Alunos removidos");
				testaListaEncadeada.removerAluno(listaEncadeada);
				while (listaEncadeada.temProximo()) {
					System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
				}
				break;
			case 3:
		        System.out.print("Digite o nome do aluno: ");
		        String nome = kb.nextLine();
		        Alunos encontrado = listaEncadeada.pesquisarPorNome(nome);
		        if (encontrado != null) {
		            System.out.println("Aluno encontrado: " + encontrado);
		        } else {
		            System.out.println("Aluno não encontrado.");
		        }
				break;
			case 4:
				listaEncadeada.listarRegistros();
				break;
			case 5:
				listaEncadeada.ordemAlfabetica();
				System.out.println("Lista ordenada em ordem alfabética");
				listaEncadeada.listarRegistros();
				break;
			default:
				System.out.println("Operação encerrada!");
			}
			} while (op != 0);
		kb.close();
	}
	
	public void addAlunos(ListaEncadeada listaEncadeada) {
		Alunos aluno1 = new Alunos("Davi", 2000);
		Alunos aluno2 = new Alunos("Luis", 2050);
		Alunos aluno3 = new Alunos("Joao", 2022);
		Alunos aluno4 = new Alunos("Elder", 2010);

		listaEncadeada.adicionar(aluno1);
		listaEncadeada.adicionar(aluno2);
		listaEncadeada.adicionar(aluno3);
		listaEncadeada.adicionar(aluno4);
	}

	public void removerAluno(ListaEncadeada listaEncadeada) {
		listaEncadeada.remover();
	}
}