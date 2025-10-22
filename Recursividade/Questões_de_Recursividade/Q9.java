public class Q9 {
    public static void main(String[] args) {
        System.out.println(potencia(2, 3));
    }

    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiplicar(a, b - 1);
        } else {
            return -multiplicar(a, -b);
        }
    }

    public static int potencia(int base, int expoente) {
        if (expoente == 0){
            return 1;
        }   
        if (expoente > 0){
            return multiplicar(base, potencia(base, expoente - 1));
        } 
        return 0;
    }
}