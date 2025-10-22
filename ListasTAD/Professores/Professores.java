package Professores;

public class Professores implements IProfessores {
	private String nome;
	private int codigo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public boolean AdicionaProf() {
		return false;
	}
	public boolean RemoveProf() {
		return false;
	}
	public boolean EditarProf() {
		return false;
	}
}
