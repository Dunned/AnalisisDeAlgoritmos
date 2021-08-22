
import java.util.Scanner;

public class DarCambio {

    public static void main(String[] args) {
        Moneda m200=new Moneda(5,200);
        Moneda m100=new Moneda(3,100);
        Moneda m50=new Moneda(5,50);
        Moneda m20=new Moneda(8,20);
        Moneda m10=new Moneda(3,10);
        Moneda m5=new Moneda(9,5);
        Moneda m2=new Moneda(8,2);
        Moneda m1=new Moneda(15,1);
        Moneda m05=new Moneda(9,0.5);
        Moneda m02=new Moneda(11,0.2);
        Moneda m01=new Moneda(17,0.1);
        Moneda m005=new Moneda(26,0.05);
        Moneda m001=new Moneda(42,0.01);
        int s[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Moneda[] v = {m200, m100, m50, m20, m10, m5, m2, m1, m05, m02, m01, m005, m001};
        
        Scanner entrada = new Scanner(System.in);
        Cambio moneda = new Cambio();
        double vuelto;
        System.out.print("Ingrese cambio: ");
        vuelto = entrada.nextDouble();
        moneda.Voraz(s, v, vuelto);
        if (moneda.Solucion(s, v, vuelto)) {
            for (int i = 0; i < s.length; i++) {
                if (s[i] > 0) {
                    System.out.printf("%d monedas de %.2f soles\n", s[i], v[i].valor);
                }
            }
        } else {
            System.out.println("No hay solucion");
        }
    }
}
