import java.util.Scanner;

public class Livros {

    private PilhaEstatica<String> pilhaLivros;
    private Scanner kb = new Scanner(System.in);

    public Livros() {
        this.pilhaLivros = new PilhaEstatica<>();
    }

    public static void main(String[] args) {
        Livros gerenciador = new Livros();

        String menu = ""
            + "=== GERENCIADOR DE LIVROS PARA LER NAS FÉRIAS ===\n"
            + "1) Inserir na Pilha (1)\n"
            + "2) Consultar na Pilha (2)\n"
            + "3) Remover na Pilha (3)\n"
            + "4) Esvaziar na Pilha (4)\n"
            + "5) Sair (5)\n"
            + "Escolha uma opção: ";

        int opcao;
        do {
            System.out.print(menu);
            while (!gerenciador.kb.hasNextInt()) {
                System.out.print("Opção inválida! Digite um número: ");
                gerenciador.kb.next();
            }
            opcao = gerenciador.kb.nextInt();
            gerenciador.kb.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    gerenciador.inserirLivro();
                    break;
                case 2:
                    gerenciador.consultarLivro();
                    break;
                case 3:
                    gerenciador.removerLivro();
                    break;
                case 4:
                    gerenciador.esvaziarPilha();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        } while (opcao != 5);

        gerenciador.kb.close();
    }

    private void inserirLivro() {
        System.out.print("Digite o nome do livro a ser inserido: ");
        String livro = kb.nextLine();

        if (livro != null && !livro.trim().isEmpty()) {
            pilhaLivros.push(livro);
            System.out.println("Livro '" + livro + "' inserido na pilha!");
        } else {
            System.out.println("Nome do livro inválido!");
        }

        // Mostrar estado atual da pilha (assume método listar existe)
        pilhaLivros.listar();
    }

    private void consultarLivro() {
        if (pilhaLivros.isVazia()) {
            System.out.println("A pilha está vazia! Não há livros para consultar.");
            return;
        }

        System.out.println("1 - Consultar livro específico");
        System.out.println("2 - Listar todos os livros");
        System.out.print("Escolha o tipo de consulta: ");
        while (!kb.hasNextInt()) {
            System.out.print("Opção inválida! Digite um número: ");
            kb.next();
        }
        int tipoConsulta = kb.nextInt();
        kb.nextLine(); // Limpar buffer

        if (tipoConsulta == 1) {
            System.out.print("Digite o nome do livro a ser consultado: ");
            String livro = kb.nextLine();
            pilhaLivros.buscar(livro);
        } else if (tipoConsulta == 2) {
            pilhaLivros.listar();
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private void removerLivro() {
        if (pilhaLivros.isVazia()) {
            System.out.println("A pilha está vazia! Não há livros para remover.");
            return;
        }

        try {
            String livroRemovido = pilhaLivros.pop();
            System.out.println("Livro '" + livroRemovido + "' removido da pilha!");

            // Mostrar estado atual da pilha
            if (!pilhaLivros.isVazia()) {
                System.out.println("Próximo livro a ser lido: " + pilhaLivros.getTopo());
            } else {
                System.out.println("Pilha vazia - todos os livros foram lidos!");
            }

        } catch (PilhaVaziaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void esvaziarPilha() {
        if (pilhaLivros.isVazia()) {
            System.out.println("A pilha já está vazia!");
            return;
        }

        pilhaLivros.esvaziar();
        System.out.println("Pilha esvaziada! Todos os livros foram removidos.");
    }
}

// Exceção personalizada para pilha vazia
class PilhaVaziaException extends Exception {
    public PilhaVaziaException() {
        super("A pilha está vazia");
    }

    public PilhaVaziaException(String mensagem) {
        super(mensagem);
    }
}