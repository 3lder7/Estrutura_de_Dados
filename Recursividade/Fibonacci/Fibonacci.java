package Fibonacci;

public class Fibonacci{
	public static void main (String args[]) {
		System.out.println("Fibonacci");
		int n = 10;
		for(int i=0; i < n; i++) {
			System.out.print(Fibo(i)+ " ");
		}
	}
	
	public static int Fibo(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		return Fibo(n-1) + Fibo(n-2);
		}
}