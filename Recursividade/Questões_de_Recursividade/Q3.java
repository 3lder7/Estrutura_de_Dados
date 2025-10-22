public class Q3 {
    public static void main(String[] args) {
        String n = binario(25);
        System.out.println(n);
    }
    public static String binario(int n){
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "1";
        }else{
            return binario(n / 2) + (n % 2);
        }
    }
}
