import java.util.Scanner;
public class ejmplos122 {
    public static void main(String[] args) {
        int numer3 ,a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dimi el mes (1-12) :");
        numer3 = sc.nextInt();

 
        switch (numer3) {
            case 3:
            case 4:
            case 5:
                System.out.println("mese 1");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("mese 2");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("mese 3");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("mes 4");
                break;
            default:
                System.out.println("Messaje De Error");
                break;
        }
        
    }
}