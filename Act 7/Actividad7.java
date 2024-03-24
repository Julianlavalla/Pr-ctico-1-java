import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad7 {
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int numero3;
        
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un número real: ");
            numero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un segundo número real: ");
            numero2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese un tercer número real: ");
            numero3 = Integer.valueOf(entrada.readLine());

            System.out.println(numero1 / numero2 - numero3);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}