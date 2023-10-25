import java.util.Scanner;
public class simohajiii456 {
    public static void main(String[] args) {
        boolean esprimo=true;
        Scanner sc = new Scanner(System.in);
        int numero= sc.nextInt();
        for(int i=2 ; i<numero;i++){
            if(numero % i == 0){
                esprimo=false;
                break;
            }
            System.out.println(esprimo+"= false");
        }
    }
}
