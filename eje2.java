import java.util.Scanner;
public class eje2 {
    public static void main(String[] args) {

        // Pide un numero por teclado 
        
            Scanner mohamed = new Scanner(System.in);
            System.out.print("Introduzca un número: ");
            int numero = mohamed.nextInt();
            int countador = 0;
            System.out.println("Los divisores de " + numero + " son:");
            for (int i = 1; i <= numero; i++) {
              if (numero % i == 0) {
                System.out.println(i);
                countador++;
              }
            }
            System.out.println("El número de divisores es " + countador + ".");
          
    }
}
