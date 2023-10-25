import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        ///

        if (a % 2 == 0) {
            System.out.println("Es para");
        }
        else {
            System.out.println("Es impar");
        }


    }
}
