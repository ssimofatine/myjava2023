public class Ejercicios1 {
    public static int mayor(int a, int b, int c) {
        if (a>=b && a>=c){
            return a;

        }else if (b >= a && b >= c){
            return b;
        }else {
            return c ;
        }    
        
    }
    public static void main(String[] args) {
        int a = 2, b = 3, c= 5, d= 8;
        int simo = mayor(a, b, c);
        System.out.println("tumero es "+a+" , "+b+" y "+c+simo);
    }
}
