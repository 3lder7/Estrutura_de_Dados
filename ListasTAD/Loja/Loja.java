package Loja;

public class Loja implements ILoja {
    private String nome;
	private String codigo;
    private int quantidade;
    private double precoUnitario;
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	@Override
    public boolean AdicionarProduto() {
        return true;
    }
	@Override
    public boolean RemoverProduto() {
        return true;
    }
	@Override
    public boolean AtualizarProduto() {
        return true;
    }
	@Override
    public String ListarProdutos() {
        return "";
    }
}
