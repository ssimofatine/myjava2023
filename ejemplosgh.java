import java.util.Scanner;
public class ejemplosgh {
    public static void main(String[] args) {
        Scanner mohamed = new Scanner(System.in);
        int numero=0;
        

        while(numero != 4){
            System.out.println("Selecion: ");
            System.out.println("1. A");
            System.out.println("2. E");
            System.out.println("3. B");
            System.out.println("4. S");
            System.out.println("Entrar tu numero: ");
            numero = mohamed.nextInt();

            switch(numero){
                case 1 : System.out.println("A"); break;
                case 2 : System.out.println("E"); break;
                case 3 : System.out.println("B"); break;
                case 4 : System.out.println("S"); break;
            }
        
        }
    }
}
