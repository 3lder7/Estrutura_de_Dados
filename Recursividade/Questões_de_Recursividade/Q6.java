public class Q6 {
    public static void main (String args[]){
        contagemRegressiva(20);
    }
    
    public static int contagemRegressiva(int n) {
        if (n < 0) {
            return 0;
        }
        System.out.println(n);
        return contagemRegressiva(n - 1);
    }
}
