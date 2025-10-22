package ContaBancaria;

public class Conta implements IConta {
	private String nome;
	private int numeroConta;
	private double saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	 @Override
	 public double VisualizarSaldo() {
		return 0.0;
	 }
	 @Override
	 public boolean Depositar() {
		return false;
	 }
	 @Override
	 public boolean Sacar() {
		return false;
	 }
	 @Override
	 public boolean Atualizar() {
		 return false;
	 }
	
}
