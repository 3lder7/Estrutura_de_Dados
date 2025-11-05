package Pilhas.Lista1Pilhas.Q4;

public class TestaPilha {
        public static void main(String[] args) {
        PilhaEstatica historico = new PilhaEstatica<>();

        try {
            historico.push("https://www.github.com");
            historico.push("https://www.stackoverflow.com");
            historico.push("https://www.reddit.com");
           
            System.out.println("Página no topo: " + historico.pop());

        } catch (PilhaVaziaException e) {
            System.out.println(e.getMessage());
        }
    }
    
}

class PilhaVaziaException extends Exception {
    public PilhaVaziaException() {
        super("A pilha está vazia");
    }
    public PilhaVaziaException(String mensagem) {
        super(mensagem);
    }
}

