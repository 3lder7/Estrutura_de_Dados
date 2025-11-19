package Arvore.ListaArvore.Q1;
public class App {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        System.out.println("=== ANÁLISE DA ÁRVORE BINÁRIA ===");
        System.out.println("Árvore baseada na imagem fornecida:");

        arvore.construirArvoreExemplo();
        arvore.visualizarArvore();
        arvore.caminhamentoCentralEsquerda();
        arvore.caminhamentoPreFixadoDireita();
        arvore.caminhamentoPosFixadoEsquerda();
        arvore.mostrarNosFolhas();
        System.out.println("\n=== RELAÇÃO PAI-FILHOS ===");
        arvore.mostrarPaiEFilhos();
    }
}
