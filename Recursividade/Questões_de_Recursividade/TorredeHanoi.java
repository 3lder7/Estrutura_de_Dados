public class TorredeHanoi{
    public static void main(String[] args) {
        int n = 4; 
        System.out.println("Resolvendo a Torre de Hanoi com " + n + " discos:\n");
        resolverHanoi(n, 'A', 'C', 'B');
    }
    
    public static void resolverHanoi(int n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            resolverHanoi(n - 1, origem, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origem + " para " + destino);

            resolverHanoi(n - 1, auxiliar, destino, origem);
        }
    }
}   