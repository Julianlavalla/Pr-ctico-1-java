import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bonus2 {
    public static void main(String[] args) {
        int dia;
        float importe;


        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese el día (martes 1) (jueves 2): ");
            dia = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el importe: ");
            importe = Float.valueOf(entrada.readLine());

            if (dia == 1 && importe > 13000 && importe < 20000) {
                System.out.println("aplica descuento del 5%");
            }

            else if (dia == 1 && importe > 20000) {
                System.out.println("aplica descuento del 7.5%");
            }
            else if (dia == 2 && importe > 25000) {
                System.out.println("aplica 10% de descuento con tope de 3000$ por ticket");
            }
            else {
                System.out.println("no aplica descuento");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}