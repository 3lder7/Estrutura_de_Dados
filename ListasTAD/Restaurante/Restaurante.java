package Restaurante;

public class Restaurante implements IRestaurante {
    private String nomeCliente;
    private String itensPedido;
    private int quantidade;
    private double valorTotal;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getItensPedido() {
		return itensPedido;
	}
	public void setItensPedido(String itensPedido) {
		this.itensPedido = itensPedido;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
    public boolean AdicionarPedido() {
        return false;
    }

    @Override
    public boolean RemoverPedido() {
        return false; 
    }
    
    @Override
    public boolean EditarPedido() {
        return false;
    }
}
