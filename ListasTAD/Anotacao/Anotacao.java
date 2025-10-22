package Anotacao;

public class Anotacao implements IAnotacao {
    private String data;
    private String titulo;
    private String conteudo;
    
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	@Override
    public boolean AdicionarAnotacao() {
        return false; 
    }
    @Override
    public boolean RemoverAnotacao() {
        return false;
    }
    @Override
    public boolean EditarAnotacao() {
        return false;
    }
}
