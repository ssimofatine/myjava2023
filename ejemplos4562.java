import java.util.Scanner;
public class ejemplos4562 {
    
    
    public static boolean simohaji(int n1, int n2){
        if (n1 % n2 == 0){
            return true;

        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        int numero1, numero2;
        boolean simofatine;
        Scanner haji = new Scanner(System.in);
        System.out.println("demi uno numero : ");
        numero1 = haji.nextInt();
        System.out.println("demi otro numero : ");
        numero2 = haji.nextInt();

        simofatine = simohaji(numero1, numero2);
        

    }
}
