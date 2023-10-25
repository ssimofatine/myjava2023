import java.util.Scanner;

public class ejemplos12 {
    public static void main(String[] args) {
        //1. Declaración de variables
        int edad;

        //2. Leer de teclado esa variable
        Scanner sc = new Scanner(System.in);
        System.out.println("please write your edad");
        edad = sc.nextInt();
        
        //3. Comprobar si es par o impar
        if ((edad >= 1) && (edad <= 5)) {
            System.out.println("Nino");
        } else if ((edad >= 6) && (edad <= 12)) {
            System.out.println("chaval");
        } 
        else if ((edad >= 13) && (edad <= 18)) {
            System.out.println("Adolescente");
        } 
        else if ((edad >= 19) && (edad <= 25)) {
            System.out.println("Lomejor");
        } 
        else if ((edad >= 26) && (edad <= 45)) {
            System.out.println("Hombre");
        } 
        else if ((edad >= 46) && (edad <= 65)) {
            System.out.println("carroza");
        }
        else if ((edad >65)) {
            System.out.println("Viejo");
        } 

       

    }
}