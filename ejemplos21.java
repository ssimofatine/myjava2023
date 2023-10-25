import java.util.Scanner;
public class ejemplos21 {
    public static void main(String[] args) {
        int num,visisto;

        Scanner sc = new Scanner(System.in);
        System.out.println("please write your edad");
        num = sc.nextInt();

        if ((num%4==0)&&(num%100!=0)){
            System.out.println("bisito");
        }else if ((num%4==0)&&(num%400==0)){
            System.out.println("bisito");
        }else {
            System.out.println("no bisieto");
        }

    }
}