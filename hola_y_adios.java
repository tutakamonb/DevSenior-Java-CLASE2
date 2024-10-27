import java.util.Scanner;

public class hola_y_adios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        System.out.print("Ingresa la tercera palabra: ");
        String palabra3 = scanner.nextLine();

        
        System.out.println( "Las tre palabras son:");
         System.out.println(palabra1 + " "+ palabra2 + " "+ palabra3);
    }
}