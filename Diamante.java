public class Diamante {
    public static void main(String[] args) {
        int n = 5; // Altura del diamante

        // Parte superior del diamante
        for (int i = 1; i <= n; i++) {
            // Espacios
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior del diamante
        for (int i = n - 1; i >= 1; i--) {
            // Espacios
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}