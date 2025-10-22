package Fatorial;
public class Fatorial {
	public static void main(String[] args) {
		System.out.println("Iterativa");
		funcaoFatorialIterativa(5);
		
		System.out.println("Recursiva");
		System.out.println(funcaoFatorialRecursiva(5));
	}
	
	//ITERATIVA
	public static int funcaoFatorialIterativa(int n) {
		int resultado = 1;
		for(int i = 1; i <= n; i++) {
			System.out.println(resultado+" x "+ i +" = "+ (resultado *= i)) ;
		}
		return resultado;
	}
	
	//RECURSIVA
	public static int funcaoFatorialRecursiva(int n) {
		if(n == 0 || n == 1)  {
			return 1;
		}else {
			return n * funcaoFatorialRecursiva(n-1);//chama a função novamente, porém com o fatorial -1
		}
	}
}
