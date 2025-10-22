package Livros;

 public class Livros implements IBiblioteca{
	 private String titulo;
	 private String editora;
	 private int anoPublicacao;

	 public Livros(String titulo, String editora, int ano) {
		 this.titulo = titulo;
		 this.editora = editora;
		 this.anoPublicacao = ano; 
	 }
	 
	public String getTitulo() {
		return titulo;
	}
	 
	public void setTitulo(String titulo) {
		 this.titulo = titulo;
	}
	 
	 public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		 this.editora = editora;
	}
	 
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	 public void setAnoPublicacao(int anoPublicacao) {
		 this.anoPublicacao = anoPublicacao;
	 }
	 
	 @Override
	 public boolean Adicionar() {
		return false;
	 }
	 @Override
	 public boolean Remover() {
		return false;
	 }
	 @Override
	 public boolean Alterar() {
		return false;
	 }
 }
