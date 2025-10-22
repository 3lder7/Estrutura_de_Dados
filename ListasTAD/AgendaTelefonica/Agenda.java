package AgendaTelefonica;

public class Agenda implements IAgenda {
	private String nomeContato;
	private String numeroContato;

	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	public String getNumeroContato() {
		return numeroContato;
	}
	public void setNumeroContato(String numeroContato) {
		this.numeroContato = numeroContato;
	}
	
    public boolean Adicionar() {
        return false; 
    }

    public boolean Excluir() {
        return false; 
    }

    public boolean Atualizar() {
        return false; 
    }

    public boolean Remover() {
        return false;
    }
}