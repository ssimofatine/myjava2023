import java.util.Scanner;
public class ejemplos456 {
    public static void main(String[] args) {
        int numer3,numero5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimi el mes (1,3,5,7,8,10,12) :");
        numer3 = sc.nextInt();
        System.out.println("dimi el dia");
        numero5 = sc.nextInt();

 
        switch (numer3) {
            case 1,3,5,7,8,10,12:
            if (numero5 >= 1 && numero5 <=31){
                System.out.println("Fecha correcta");
            }else {
                System.out.println("Fecha incorrecta");
            }
            default:
                System.out.println("Messaje De Error");
                break;
        }
        
    }
} 
    

