public class EjemploUnltario {
    public static void main(String[] args){
        int sueldo = 150;
        int extra = 99;

        sueldo = sueldo + extra++;
        
        System.out.println(sueldo);
        System.out.println(extra);

    }
}
