import java.util.Scanner;
public class simooo {
    public static void main(String[] args) {
        int teclado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimi el nivel (1-5) :");
        teclado = sc.nextInt();

        if (teclado == 1 ){
            System.out.println("Inicado");
        }else if (teclado == 2){
            System.out.println("Anmture");
        }else if (teclado == 3){
            System.out.println("Proficinal");
        }else if (teclado == 4){
            System.out.println("Experto");
        }else if (teclado == 5){
            System.out.println("Nivel Dios");
        }else {
            System.out.println("Message de Messaje");
        }
        
        
    }
}
