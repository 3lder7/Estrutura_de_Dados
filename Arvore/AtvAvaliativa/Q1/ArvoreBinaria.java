package Arvore.AtvAvaliativa.Q1;

public class ArvoreBinaria {
	private No raiz;

	public ArvoreBinaria() {
		this.raiz = null;
	}
	
	//inserir números (apenas ímpares)
	public boolean insere(int valor) {
		//verifica se o número é ímpar
		if (valor % 2 == 0) {
			System.out.println("Erro: Apenas números ímpares são permitidos! (" + valor + " é par)");
			return false;
		}
		
		//verifica se o número já existe na árvore
		if (busca(valor) != null) {
			System.out.println("Erro: Número " + valor + " já existe na árvore!");
			return false;
		}
		
		// se vazia, insere como raiz
		if (vazia()) {
			return insereRaiz(valor);
		}
		
		// insere na posição correta (árvore de busca binária)
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
	
	// insere de forma ordenada (árvore de busca binária)
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
	
	//verifica se a árvore é vazia
	public boolean vazia() {
		return (raiz == null);
	}
	
	// metodo busca público
	public No busca(int valor) {
		if (vazia()) {
			return null;
		}
		return busca(raiz, valor);
	}
	
	// metodo busca privado (recursivo)
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
	
	// exibe em pré-ordem (RAIZ -> ESQUERDA -> DIREITA)
	public void exibePreOrdem() {
		if (raiz == null) {
			System.out.println("A árvore está vazia!");
		} else {
			System.out.print("Elementos em pré-ordem: ");
			exibePreOrdem(raiz);
			System.out.println();
		}
	}
	
	// metodo privado para exibir em pré-ordem
	private void exibePreOrdem(No T) {
		if (T == null) {
			return;
		}   
		System.out.print(T.getDado() + " ");
		exibePreOrdem(T.getEsq());
		exibePreOrdem(T.getDir());
	}
}