package Carrinhos;

public class Carrinhos implements ICarrinhos {
    private String modelo;
    private int anoFabricacao;
    private String raridade;
    
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getRaridade() {
		return raridade;
	}
	public void setRaridade(String raridade) {
		this.raridade = raridade;
	}
	
	@Override
    public boolean AdicionarCarrinho() {
        return false; 
    }
	@Override
    public boolean removerCarrinho() {
        return false; 
    }
	@Override
    public boolean editarCarrinho() {
        return false;
    }
	
}
