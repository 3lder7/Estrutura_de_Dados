package Alunos;

public class Alunos implements IAlunos {
	private String nome;
	private int semestre;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	 @Override
	 public boolean AdicionaAluno() {
		return false;
	 }
	 @Override
	 public boolean RemoveAluno() {
		return false;
	 }
	 @Override
	 public boolean AlteraAluno() {
		return false;
	 }
}
