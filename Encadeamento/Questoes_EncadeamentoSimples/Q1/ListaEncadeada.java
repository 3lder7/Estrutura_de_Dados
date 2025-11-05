package Encadeamento.Questoes_EncadeamentoSimples.Q1;
public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	private int tamanho;

	public void adicionar(Professor valor) {
		Celula celula = new Celula();
		celula.setValor(valor);

		if (primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
		tamanho++;
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

	public int verificarTamanho() {
		return tamanho;
	}

	public void remover() {
		if (primeiro.getProximo() != null) {
			Celula celula = this.recuperarPenultimo(this.primeiro);
			celula.setProximo(null);
		} else {
			primeiro = ultimo = null;
		}
		tamanho--;
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

	public void apagarLista() {
		primeiro = null;
		ultimo = null;
		posicaoAtual = null;
		tamanho = 0;
		System.out.println("Lista apagada.");
	}

	public void listarRegistros() {
		if (estaVazia()) {
			System.out.println("A lista está vazia.");
			return;
		}

		System.out.println("Professores do curso de Análise da UCSAL:");
		Celula atual = primeiro;
		int contador = 1;

		while (atual != null) {
			System.out.println(contador + ". " + atual.getValor());
			atual = atual.getProximo();
			contador++;
		}
	}
}