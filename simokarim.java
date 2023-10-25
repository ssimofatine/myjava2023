public class simokarim {
    public static void main(String[] args) {
        int numero=456;
        int centenas, unidades;
        centenas=numero/100;
        double decnas=numero/10;
        unidades=numero%10;
        System.out.println("centenas "+centenas);
        System.out.println("decnas " + decnas);
        System.out.println("unidades " + unidades);
        double numerHaji = (100*centenas)+(10*decnas)+(unidades);
        System.out.println(numerHaji+"");
        
    }
}
