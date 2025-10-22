package Fila;

public class Fila implements IFila {
    private String nomePaciente;
    private int prioridade;
    private String horarioChegada;
    
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public String getHorarioChegada() {
		return horarioChegada;
	}
	public void setHorarioChegada(String horarioChegada) {
		this.horarioChegada = horarioChegada;
	}
    @Override
    public boolean AdicionarPaciente() {
        return false;
    }
    @Override
    public boolean RemoverPaciente() {
        return false;
    }
    @Override
    public boolean AtualizarPrioridade() {
        return false;
    }
}
