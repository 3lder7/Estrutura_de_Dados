package Racionais;

public class Racionais implements IRacionais {
    private int numerador;
	private int denominador;
	
	public int getNumerador() {
		return numerador;
	}
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

    public int getDenominador() {
		return denominador;
	}
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	 @Override
	 public double Criar() {
		return 0.0;
	 }
	
	 @Override
	 public double Somar() {
		return 0.0;
	 }
	 @Override
	 public double Multiplicar() {
		return 0.0;
	 }
	 @Override
	 public double Testar() {
		return 0.0;
	 }

}
