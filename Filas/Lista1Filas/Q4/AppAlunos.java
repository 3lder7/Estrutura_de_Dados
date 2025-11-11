import java.util.Scanner;

public class AppAlunos {
    public class PrincipalSalaDeAula {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            FilaDinamica<Aluno> fila = new FilaDinamica<>();
            int opcao;

            do {
                System.out.println("\n===== SALA DE AULA =====");
                System.out.println("1 - Inserir aluno");
                System.out.println("2 - Consultar alunos");
                System.out.println("3 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine(); // consome quebra de linha

                switch (opcao) {
                    case 1:
                        System.out.print("\nNome do aluno: ");
                        String nome = sc.nextLine();
                        System.out.print("Idade do aluno: ");
                        int idade = sc.nextInt();

                        Aluno novo = new Aluno(nome, idade);
                        inserirOrdenado(fila, novo);
                        System.out.println("Aluno adicionado com sucesso!");
                        break;

                    case 2:
                        try {
                            System.out.println("\n=== Alunos na fila (ordenados por idade) ===");
                            fila.listar();
                        } catch (FilaVaziaException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        System.out.println("\nEncerrando o sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                        break;
                }
            } while (opcao != 3);

            sc.close();
        }

        //manter a fila ordenada por idade
        private static void inserirOrdenado(FilaDinamica<Aluno> fila, Aluno novo) {
            FilaDinamica<Aluno> temp = new FilaDinamica<>();

            try {
                boolean inserido = false;

                while (!fila.isVazia()) {
                    Aluno atual = fila.poll();

                    if (!inserido && novo.getIdade() < atual.getIdade()) {
                        temp.offer(novo);
                        inserido = true;
                    }

                    temp.offer(atual);
                }

                if (!inserido) {
                    temp.offer(novo);
                }

                // recarregar a fila original com os elementos ordenados
                while (!temp.isVazia()) {
                    fila.offer(temp.poll());
                }

            } catch (FilaVaziaException e) {
                temp.offer(novo);
                try {
                    while (!temp.isVazia()) {
                        fila.offer(temp.poll());
                    }
                } catch (FilaVaziaException ignored) {
                }
            }
        }
    }
}
