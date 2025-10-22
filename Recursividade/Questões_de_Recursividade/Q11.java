public class Q11 {
    public static void main(String[] args) {
        String original = "recursividade";
        String invertida = inverter(original);

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }

    public static String inverter(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + inverter(str.substring(0, str.length() - 1));
    }
}
