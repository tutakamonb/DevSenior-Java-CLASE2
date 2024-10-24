import java.util.Scanner;
public class HolaMundo{

    public static void main(String[] args) {   
        
         System.out.println("Hola Manuel!");

         System.out.print("como van las cosas");
         System.out.print(10);


         System.out.printf("Aqui va una cadena: %s%n", "Manuel");
         System.out.printf("Aqui va un entero: %d%n", 10);
         System.out.printf("Mi nombre es %s y tengo %d años %n", "Manuel Barrera", 51);


         var entrada = new Scanner(System.in);
         
         System.out.println("Por favor ingrese su nombre: ");
         var entero =entrada.nextLine();
        
         System.out.println(entero);

         entrada.close();
    }
}