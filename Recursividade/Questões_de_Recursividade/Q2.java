
public class Q2 {
    public static void main(String[] args) {
        System.out.println(fatorial(10));
    }

    public static int fatorial(int n){
        if(n == 0){
            return 1;
        }else{
            return fatorial(n-1)*n;
        }
    }
}
