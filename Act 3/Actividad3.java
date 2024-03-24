import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad3 {
    public static void main(String[] args) {
        int entero;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese un valor entero: ");
            entero = Integer.valueOf(entrada.readLine());
            System.out.println("Entero ingresado: " + entero);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}