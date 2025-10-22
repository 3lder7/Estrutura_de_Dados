public class Q13 {

    public static void main(String[] args) {
        String texto = "banana";
        char letra = 'a';

        System.out.println(contarChar(texto, letra));
    }
    public static int contarChar(String str, char c) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == c) ? 1 : 0;
        return count + contarChar(str.substring(1), c);
    }
}
