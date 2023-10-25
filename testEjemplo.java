public class testEjemplo {
    public static void main(String[] args) {
        int a,b,c;
        int resultado;
        a=6;
        b=2;
        c=3;

        // resultado 1 for : (A * C) % C

        resultado = ((a*c)%b);
        System.out.println("resultado 1 = " + resultado); // resultado 1 = 0

        // resultado 2 for : A * B / C

        resultado = ((a*b)/c);
        System.out.println("resultado 2 = " + resultado); // resultado 2 = 4

        // resultado 3 for : C % B + C * B

        resultado = ((c%b) + (c*b));
        System.out.println("resultado 3 = " + resultado); // resultado 3 = 7

        // resultado 4 for : A % ( A * B * C / (B + C) )

        resultado= (a%((a+b+c)/(b+c)));
        System.out.println("resultado 4 = " + resultado); // resultado 4 = 0

        // resultado 5 for : B * B + C – B * (A % B )

        resultado = (b*b) + (c-b) * (a%b);
        System.out.println("resultado 5 = " + resultado); // resultado 5 = 4





    }
}
