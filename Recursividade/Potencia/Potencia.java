package Potencia;

public class Potencia{
	public static void main(String[] args) {
		System.out.println(Pot(3, 5));//3 elevado a 5
	}
	
	public static int Pot(int n, int expo) {
		if(expo == 0) {
			return 1;
		}else {
			return(n * Pot( n, expo -1));
		}
	}
}
