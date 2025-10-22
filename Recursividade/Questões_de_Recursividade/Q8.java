public class Q8 {
    public static void main(String[] args) {
        System.out.println(somaNaturais(10));
       
    }

    public static int somaNaturais(int n){
        if(n <= 1){
            return n;
        } else {
            return n + somaNaturais(n - 1);
        }
    }
}
