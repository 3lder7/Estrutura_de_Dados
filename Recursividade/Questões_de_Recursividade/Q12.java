public class Q12 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(somaArray(numeros, numeros.length));
    }
    public static int somaArray(int[] array, int n) {
        if (n == 0) {
            return 0;
        }
        return somaArray(array, n - 1) + array[n - 1];
    }
}
