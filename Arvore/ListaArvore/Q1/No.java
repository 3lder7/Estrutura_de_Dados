package Arvore.ListaArvore.Q1;

public class No {
	private int dado;
	private No esq, dir;
	
	public No() {
		this.esq = null;
		this.dir = null;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}
}