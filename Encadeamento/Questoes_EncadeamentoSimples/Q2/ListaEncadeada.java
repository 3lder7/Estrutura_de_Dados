package Estrutura_de_Dados.Encadeamento.ListaEncadeada_Angela_3.Q2;


public class ListaEncadeada {
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;

	public void adicionar(Alunos valor) {
		Celula celula = new Celula();
		celula.setValor(valor);

		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}

	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}
	
	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		} else if (posicaoAtual == null) {
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}
	
	public void remover() {
		if (primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
	}

	private Celula recuperarPenultimo(Celula celula) {
		if (celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public Alunos pesquisarPorNome(String nome) {
	    if (estaVazia()) {
	        return null;
	    }
	    Celula atual = primeiro;
	    while (atual != null) {
	        if (atual.getValor().getNome().equalsIgnoreCase(nome)) {
	            return atual.getValor();
	        }
	        atual = atual.getProximo();
	    }
	    return null; 
		
	}
	
	public void listarRegistros() {
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
			return;
		}

		System.out.println("Alunos do curso de Análise da UCSAL:");
		Celula atual = primeiro;
		int contador = 1;

		while (atual != null) {
			System.out.println(contador + ". " + atual.getValor());
			atual = atual.getProximo();
			contador++;
		}
	}

	public void ordemAlfabetica() {
		    if (estaVazia() || primeiro.getProximo() == null) {
		        return;
		    }
		    boolean trocou;
		    do {
		        trocou = false;
		        Celula atual = primeiro;
		        
		        while (atual.getProximo() != null) {
		            if (atual.getValor().compareTo(atual.getProximo().getValor()) > 0) {
		                Alunos temp = atual.getValor();
		                atual.setValor(atual.getProximo().getValor());
		                atual.getProximo().setValor(temp);
		                trocou = true;
		            }
		            atual = atual.getProximo();
		        }
		    } while (trocou);
	}
}