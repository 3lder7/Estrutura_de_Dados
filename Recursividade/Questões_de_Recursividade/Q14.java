public class Q14 {
    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5};
        System.out.println(maiorElemento(numeros, numeros.length));
        
    }

    public static int maiorElemento(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        if (array[n - 1] > maiorElemento(array, n - 1)) {
            return array[n - 1];
        } else {
            return maiorElemento(array, n - 1);
        }
    }
}
