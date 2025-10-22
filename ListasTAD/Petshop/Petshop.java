package Petshop;

public class Petshop implements IPetshop {
    private String nome;
    private String telefoneTutor;
    private String dataNascimento;
    private String raca;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefoneTutor() {
		return telefoneTutor;
	}
	public void setTelefoneTutor(String telefoneTutor) {
		this.telefoneTutor = telefoneTutor;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public boolean CadastrarPet() {
		return false;
	}
	@Override
	public boolean RemoverPet() {
		return false;
	}
	@Override
	public boolean CadastrarTutor() {
		return false;
	}
	@Override
	public boolean EditarTutor() {
		return false;
	}
}
