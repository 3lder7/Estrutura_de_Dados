public class Q4 {
    public static void main(String[] args) {
        System.out.println(somaAlgs(1234));
    }

    public static int somaAlgs(int n){
        if (n == 0) {
            return n;
        }else{
           return (n%10)+somaAlgs(n/10);
        }
    }
}
