package Funcionario;

public class Funcionario implements IFuncionario {
    private String nome;
    private String cargo;
    private double salario;
    private String dataAdmissao;
    
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
    public boolean AlterarCargo() {
        return false; 
    }

	@Override
    public boolean AumentarSalario() {
        return false; 
    }

	@Override
    public boolean DemitirFuncionario() {
        return false; 
    }
}
