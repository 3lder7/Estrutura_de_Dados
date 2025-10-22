package Compras;

public class Compras implements ICompras {
    private String data;
    private String itensComprados;
    private double valorTotal;
    
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getItensComprados() {
		return itensComprados;
	}
	public void setItensComprados(String itensComprados) {
		this.itensComprados = itensComprados;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
   @Override
   public boolean AdicionarCompra() {
        return true;
    }
   	@Override
    public boolean RemoverCompra() {
        return true;
    }
    @Override
    public boolean EditarCompra() {
        return true;
    }
    @Override
    public String ListarCompras() {
        return "";
    }
}
