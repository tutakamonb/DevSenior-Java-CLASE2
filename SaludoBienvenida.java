import java.util.Scanner;

public class SaludoBienvenida {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Pedir el nombre al usuario
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        // Mostrar un saludo de bienvenida
        System.out.println( nombre + ", bienvenido al curso de programación en Java!");
        
        // Cerrar el scanner
        scanner.close();
    }
}