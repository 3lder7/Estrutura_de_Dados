
public class Q1 {
    public static void main(String[] args){
        System.out.println(CalculaMDC(10, 15));
    }

public static int CalculaMDC(int m, int n) {
    if (n == 0) {
        return m;
    } else {
        return CalculaMDC(n, m % n);
    }
}
}
