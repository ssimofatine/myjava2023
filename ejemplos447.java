import java.util.Scanner;
public class ejemplos447 {
    
    public static int generTirada(){
        int simokamal;
        simokamal =((int) (Math.random()*10)+1);
        return simokamal;
    }
    public static void main(String[] args) {
        int TotalEmpate =0;
        int tirada1,tirada2;
        int totalJugador1=0;
        int totalJugador2=0;
        int turno;
        Scanner sc = new Scanner(System.in);
        System.out.println("demi uno numero : ");
        turno = sc.nextInt();
        for(int i=1 ; i<=turno ; i++){
            System.out.println("turno"+i);
            tirada1 = generTirada();
            tirada2 = generTirada();
            System.out.println("Cuble (j1): " + tirada1 + " Humerus (j2)" + tirada2);
        
            if( tirada1 > tirada2){
                System.out.println("Este turno lo gona ");
                totalJugador1 = totalJugador1 + (tirada1 + tirada2);
                if(TotalEmpate > 0){
                    totalJugador1 = totalJugador1 + TotalEmpate;
                    TotalEmpate = 0;
                }
            }else if (tirada2 > tirada1){
                System.out.println("Este turno lo gona ");
                totalJugador2 = totalJugador2 +(tirada1 + tirada2);
            }else{
                TotalEmpate = TotalEmpate + (tirada1 + tirada2);
            }


        }
       
    }
}
