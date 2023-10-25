import java.util.Scanner;

public class ejemplos2024 {
    public static void main(String[] args) {
        Scanner mohamed = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número: ");
        numero = mohamed.nextInt();

        for (int i=numero;i>=1;i--){

            for (int j=1; j<=i ; j++){
                System.out.print("*");

            }
            System.out.println();
        }
       
    }
}
