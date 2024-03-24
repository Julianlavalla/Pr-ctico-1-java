import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad9 {
    public static void main(String[] args) {
        
        int entero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un número entero: ");
            entero = Integer.valueOf(entrada.readLine());
            System.out.println((entero / 2) / 3 / 4);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}    