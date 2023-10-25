public class testEjemplo3 {
    public static void main(String[] args) {
        
        boolean a,b,d,e,c;

        //

        a = ((3<=7) && (7<=7)) ;
        System.out.println(a);  // resultado 1 = true

        //

        b= !((-8>1) && (3<=4));

        System.out.println(b); // resultado 2 = true


        //

        c = ("Hola") == ("Hola") ;

        System.out.println(c);// resultado 3 = true

        //

        d = ((2<=5) && (3>=6)) || (2>-1) ;
        System.out.println(d);

        //

        e =((2<=5) || (3>=6)) && (2>-1);
        System.out.println(e);



    }
}
