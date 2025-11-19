package Arvore.AtvAvaliativa.Q4;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }
    
    //inserir
    public boolean insere(int valor) {
        if (busca(valor) != null) {
            return false; //já existe
        }
        
        if (vazia()) {
            return insereRaiz(valor);
        }
        
        return insereOrdenado(raiz, valor);
    }
    
    // insere a raiz
    private boolean insereRaiz(int dado) { 
        if (raiz != null) {
            return false;
        }

        No novoNo = new No();
        novoNo.setDado(dado);
        raiz = novoNo;
        return true;
    }
    
    // insere de forma ordenada (recursividade)
    private boolean insereOrdenado(No T, int valor) {
        if (valor < T.getDado()) {
            if (T.getEsq() == null) {
                No novoNo = new No();
                novoNo.setDado(valor);
                T.setEsq(novoNo);
                return true;
            } else {
                return insereOrdenado(T.getEsq(), valor);
            }
        } else {
            if (T.getDir() == null) {
                No novoNo = new No();
                novoNo.setDado(valor);
                T.setDir(novoNo);
                return true;
            } else {
                return insereOrdenado(T.getDir(), valor);
            }
        }
    }
    
    //se a árvore é vazia
    public boolean vazia() {
        return (raiz == null);
    }
    
    //busca público
    public No busca(int valor) {
        if (vazia()) {
            return null;
        }
        return busca(raiz, valor);
    }
    
    //busca privado (recursivo)
    private No busca(No T, int valor) {
        if (T == null) {
            return null;
        }
        
        if (T.getDado() == valor) {
            return T;
        }
        
        No aux = busca(T.getEsq(), valor);
        if (aux == null) {
            aux = busca(T.getDir(), valor);
        }
        return aux;
    }
    
    // Exibe em pré-ordem (RAIZ -> ESQUERDA -> DIREITA) - RECURSIVO
    public void exibePreOrdem() {
        if (raiz == null) {
            System.out.println("A árvore está vazia!");
        } else {
            System.out.print("Árvore em pré-ordem: ");
            exibePreOrdem(raiz);
            System.out.println();
        }
    }
    
    //exibir em pré-ordem
    private void exibePreOrdem(No T) {
        if (T == null) {
            return;
        }   
        System.out.print(T.getDado() + " ");
        exibePreOrdem(T.getEsq());
        exibePreOrdem(T.getDir());
    }
    
    //separar números pares e ímpares (recursivo)
    public void separarParesImpares(Pilha pilha, Fila fila) {
        if (vazia()) {
            return;
        }
        separarParesImpares(raiz, pilha, fila);
    }
    
    //separar pares e ímpares
    private void separarParesImpares(No T, Pilha pilha, Fila fila) {
        if (T == null) {
            return;
        }
        
        int valor = T.getDado();
        if (valor % 2 == 0) {
            pilha.empilhar(valor); // Par vai para a pilha
        } else {
            fila.inserir(valor); // Ímpar vai para a fila
        }
        
        separarParesImpares(T.getEsq(), pilha, fila);
        separarParesImpares(T.getDir(), pilha, fila);
    }
}
