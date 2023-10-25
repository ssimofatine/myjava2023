public class doublesuma {

    /*public static double suma(double a, double b, double c){
        return a + b + c ;
    }

    public static void main(String[] args){
        System.out.println(suma(5.5,20.5,4.5));
    }*/

    public static double calcoladora(double numero1, double numero2, String op){
        if(op.equals("+")){
            return numero1 + numero2;
        }else if (op.equals("-")){
            return numero1 - numero2;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println( calcoladora(3.5, 2.0, "-"));
        System.out.println(calcoladora(3, 2, "+"));
    }
}
