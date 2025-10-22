package Campeonato;

public class Campeonato implements ICampeonato {
    private String nomeCampeonato;
    private String timesParticipantes;
    private String sistemaPontuacao;
    
	public String getNomeCampeonato() {
		return nomeCampeonato;
	}
	public void setNomeCampeonato(String nomeCampeonato) {
		this.nomeCampeonato = nomeCampeonato;
	}
	public String getTimesParticipantes() {
		return timesParticipantes;
	}
	public void setTimesParticipantes(String timesParticipantes) {
		this.timesParticipantes = timesParticipantes;
	}
	public String getSistemaPontuacao() {
		return sistemaPontuacao;
	}
	public void setSistemaPontuacao(String sistemaPontuacao) {
		this.sistemaPontuacao = sistemaPontuacao;
	}
	
	@Override
	public boolean AdicionarTime() {
        return false;
    }
	@Override
    public boolean RemoverTime() {
        return false;
    }
	@Override
    public boolean AtualizarSistemaPontuacao() {
        return false; 
    }
}
