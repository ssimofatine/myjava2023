import java.util.Scanner;
public class menuExpciones {
    public static void main(String[] args) {
        int opcion=0;
        Scanner sc = new Scanner(System.in);
        while (opcion != 3) {
            System.out.println("1. saludo anonimo");
            System.out.println("2. saloud con tu nombre");
            System.out.println("3. salir");
            
            try {
                System.out.println("Dime una opcion : ");
                opcion =Integer.parseInt(sc.nextLine());
                switch(opcion){
                case 1 :
                    System.out.println("Buenas tardes");
                break;
                case 2 :
                    System.out.println();
                    String nombre = sc.nextLine();
                    System.out.println("Buenas Tardes Javi"+ nombre);
                    break;
                default:
                System.out.println("Adios , que tengas un buen dia");
                break;
            }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("te has equivocada al escribir la opcion , por favor escribe (1,2,3)");
            }
            
        }
    }
}
