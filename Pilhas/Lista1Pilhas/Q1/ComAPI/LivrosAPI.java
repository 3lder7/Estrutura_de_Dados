import java.util.Stack;
import java.util.Scanner;

public class LivrosAPI{
    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        String menu = ""
            + "=== GERENCIADOR DE LIVROS ===\n"
            + "1) Inserir na Pilha (1)\n"
            + "2) Consultar na Pilha (2)\n"
            + "3) Remover na Pilha (3)\n"
            + "4) Esvaziar na Pilha (4)\n"
            + "5) Sair (5)\n"
            + "Escolha uma opção: ";
        
        do {
            System.out.print(menu);
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1: { // Inserir
                    System.out.print("Digite o nome do livro a ser inserido: ");
                    String livro = scanner.nextLine();
                    if (!livro.trim().isEmpty()) {
                        pilhaLivros.push(livro);
                        System.out.println("Livro '" + livro + "' inserido na pilha!");
                    } else {
                        System.out.println("Nome do livro inválido!");
                    }
                }
                
                case 2: { // Consultar
                    if (pilhaLivros.empty()) {
                        System.out.println("A pilha está vazia! Não há livros para consultar.");
                    } else {
                        System.out.println("1 - Consultar livro específico");
                        System.out.println("2 - Listar todos os livros");
                        System.out.println("3 - Ver topo da pilha");
                        System.out.print("Escolha o tipo de consulta: ");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();
                        
                        switch (tipo) {
                            case 1: {
                                System.out.print("Digite o nome do livro: ");
                                String livro = scanner.nextLine();
                                if (pilhaLivros.contains(livro)) {
                                    System.out.println("Livro '" + livro + "' encontrado!");
                                } else {
                                    System.out.println("Livro '" + livro + "' não encontrado!");
                                }
                            }
                            case 2: {
                                System.out.println("Livros na pilha (do topo para base):");
                                for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
                                    System.out.println((pilhaLivros.size() - i) + ". " + pilhaLivros.get(i));
                                }
                            }
                            case 3: System.out.println("Topo: " + pilhaLivros.peek());
                            default: System.out.println("Opção inválida!");
                        }
                    }
                }
                
                case 3 : { // Remover
                    if (pilhaLivros.empty()) {
                        System.out.println("A pilha está vazia! Não há livros para remover.");
                    } else {
                        String removido = pilhaLivros.pop();
                        System.out.println("Livro '" + removido + "' removido da pilha!");
                        if (!pilhaLivros.empty()) {
                            System.out.println("Próximo livro: " + pilhaLivros.peek());
                        }
                    }
                }
                
                case 4: { // Esvaziar
                    if (pilhaLivros.empty()) {
                        System.out.println("A pilha já está vazia!");
                    } else {
                        pilhaLivros.clear();
                        System.out.println("Pilha esvaziada! Todos os livros removidos.");
                    }
                }
                
                case 5 : System.out.println("Saindo do programa...");
                
                default: System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 5);
        
        scanner.close();
    }
}