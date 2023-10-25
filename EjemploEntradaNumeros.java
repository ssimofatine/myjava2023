import java.util.Scanner ; // import la calse para podre usarla

public class EjemploEntradaNumeros {
    public static void main(String[] args){

        int edad;
        Double peso ;
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu Edad:" );
        
        ////
        edad = sc.nextInt();
        System.out.println("Tu edad es " + edad);

        //
        System.out.println("Demi Tu peso ");
        peso = sc.nextDouble();
        System.out.println("Tu peso es " + peso);

    }
}
