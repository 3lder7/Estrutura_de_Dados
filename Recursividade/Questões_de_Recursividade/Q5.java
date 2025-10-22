public class Q5 {
    public static void main(String args[]){
        int n= 20;
        for(int i = 1; i <= n; i++){
            System.out.println(calc(i));
        }
    }

    public static int calc(int i){
        if(i > 0){
           return calc(i - 1) + 1;
        }
        return i;
    }
}
