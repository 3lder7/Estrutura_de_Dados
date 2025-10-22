package Playlist;

public class Playlist implements IPlaylist{
    private String tituloMusica;
    private String artista;
    private String duracao;
    
	public String getTituloMusica() {
		return tituloMusica;
	}
	public void setTituloMusica(String tituloMusica) {
		this.tituloMusica = tituloMusica;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	@Override
    public boolean AdicionarMusica() {
        return false; 
    }
	@Override
    public boolean RemoverMusica() {
        return false; 
    }
	@Override
    public String ListarMusicas() {
        return "";
    }
}
