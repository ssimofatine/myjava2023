import java.util.Scanner;
public class Ejemplos4568s {
    public static int tirada() {
        // cubitus y thneros juegan a los dados,
        //1. pedi por teclado el numero de turno a jugar,
        //2.cubituas tira cuatro dados del 1 al 6 (tridda-1,tiradaj2-3, tiradaj2-4)
        //Humerus tira un dado del 1 al 6. (tiradaJ1).
        // Si el valor de la tirada de Humerus no esta en minguno de los dados de cubitus , gana un punto Humerus.
        // Si no gana un punto Cubitus.
        //3. Muestra todas la tirada, la puntuacion en cada turno, y el resultado final.
        int dice;
        int min = 1, max=6;
        dice = (int) (Math.random()*max-min +1)+min;
        return dice;

    }
    public static void main(String[] args) {
        int tiradaJ1,tiradaJ2,tiradaJ3,tiradaJ4,tiradaJ15;
        int turnos;
        int suma1=0;
        int suma2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero de turno a jugar");
        turnos = sc.nextInt();
        try{
            for(int i=1; i<= turnos; i++){
            System.out.println("Turno " + i);
            
            tiradaJ1 = tirada();
            tiradaJ2 = tirada();
            tiradaJ3 = tirada();
            tiradaJ4 = tirada();
            tiradaJ15 = tirada();

            System.out.println( "Tirada Jugador2 ->" + tiradaJ1 +  ", "+ tiradaJ2 +  ", "+ tiradaJ3 +  ", "+ tiradaJ4);
                if (tiradaJ1 == tiradaJ2 || tiradaJ1 == tiradaJ3 || tiradaJ1 == tiradaJ4 || tiradaJ1 == tiradaJ15 ){
                suma1++;
                }else{
                suma2++;
                }
        }
            }catch (Exception ex) {
            System.out.println("No has introducido un número para los turnos a jugar");
            }
            System.out.println("El J1 ha sacado " + suma1 + " puntos");
        System.out.println("El J2 ha sacado " + suma2 + " puntos");
    }
}
