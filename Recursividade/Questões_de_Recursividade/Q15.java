public class Q15 {
    public static void main(String[] args) {
        System.out.println(mmc(12, 18));
    }
    
    //mdc
    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }
    //mmc
    public static int mmc(int a, int b) {
        return (a * b) / mdc(a, b);
    }
}
