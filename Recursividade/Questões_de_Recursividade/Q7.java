import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String palavra;
		palavra = kb.next();
		
		System.out.println(inverteString(palavra, 0, palavra.length()-1));
        kb.close();
    }

    public static boolean inverteString(String palavra, int x, int y) {
		palavra = palavra.strip().toLowerCase();
		if(palavra.charAt(x) != palavra.charAt(y)) {
			return false;
		}
		if(x == y) {
			return true;
		}

		return inverteString(palavra, x+1, y-1);

	}
}