import java.util.Scanner;
public class hajiii45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrat tu numero :");
        int numero = 0;
        int contador=1;
        int NumeroOriginal;
        numero=sc.nextInt();
        NumeroOriginal=numero;
        while((numero/10)>0){
            contador++;
            numero=(numero/10);
        }
        System.out.println("El numero "+ NumeroOriginal + " tiene = "+contador+" digitos");
    }
}