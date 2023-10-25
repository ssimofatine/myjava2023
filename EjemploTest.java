import java.util.Scanner ; 

public class EjemploTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double cateto1, cateto2;
        double hipotenusa ;

        System.out.println(" tell me cateto 1");

         cateto1 = sc.nextDouble();
         
         System.out.println(" tell me cateto 2" );

         cateto2 = sc.nextDouble();
         

         hipotenusa = Math.sqrt((cateto1*cateto2) + (cateto2*cateto1));

         hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

         System.out.println(" La hipotenusa es " + hipotenusa);



    }
}
