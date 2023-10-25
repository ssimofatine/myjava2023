import java.util.Scanner;
public class ejemplos154 {
    public static void main(String[] args) {
        int numer3 ,a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimi el mes (1-12) :");
        numer3 = sc.nextInt();

 
        switch (numer3) {
            case 1:
                System.out.println("mese 1");
                break;
            case 2:
                System.out.println("mese 2");
                break;
            case 3:
                System.out.println("mese 3");
                break;
            case 4:
                System.out.println("mes 4");
                break;
            case 5:
                System.out.println("mese 5");
                break;
            case 6:
                System.out.println("mese 6");
                break;
            case 7:
                System.out.println("mese 7");
                break;
            case 8:
                System.out.println("mese 8");
                break;
            case 9:
                System.out.println("mese 9");
                break;
            case 10:
                System.out.println("mese 10");
                break;
            case 11:
                System.out.println("mese 11");
                break;
            case 12:
                System.out.println("mese 12");
                break;
            default:
                System.out.println("Messaje De Error");
                break;
        }
        
    }
}