package Encadeamento.Questoes_DuplamenteEncadeada.Q3;

import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        System.out.println("=== Cadastro de 5 Alunos (final da lista) ===");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nAluno " + i + ":");
            System.out.print("Digite o nome: ");
            String nome = kb.nextLine().trim();
            
            System.out.print("Digite a idade: ");
            int idade = kb.nextInt();
            kb.nextLine();//limpa buffer
            
            if (!nome.isEmpty()) {
                Aluno aluno = new Aluno(nome, idade);
                lista.inserirFinal(aluno);
            } else {
                System.out.println("Nome inválido, pulando cadastro.");
                i--;
            }
        }

        // inserir um aluno no final
        System.out.println("\n=== Inserindo 1 aluno no FINAL da lista ===");
        System.out.print("Digite o nome do aluno: ");
        String nomeFinal = kb.nextLine().trim();
        System.out.print("Digite a idade do aluno: ");
        int idadeFinal = kb.nextInt();
        kb.nextLine();//limpa buffer
        Aluno alunoFinal = new Aluno(nomeFinal, idadeFinal);
        lista.inserirFinal(alunoFinal);

        kb.close();
        
        // exibir os 7 alunos
        System.out.println("\n=== Listando os 7 Alunos na Lista Duplamente Encadeada ===");
        lista.exibir();

    }
}
