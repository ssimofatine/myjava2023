import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        String user,pass,a,b,d,c;
        c ="12345678";
        a= "Entrar Nombre de Usuario";
        b = "Entrar una contraseña";
        d = "pepe" ;
        //////
        Scanner sc = new Scanner(System.in);
        System.out.println(a);
        user = sc.nextLine();
        /////

        System.out.println(b);
        pass = sc.nextLine();

        ///

        if ( (user.equals(d)) && (pass.equals(c)) ) {
            System.out.println("Has entrado al sistema");

        }
        else {
            System.out.println("sino se da un error.");
        }


    }
}
