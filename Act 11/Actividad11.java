import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad11 {
    public static void main(String[] args) {
        
        int entero;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un número entero: ");
            entero = Integer.valueOf(entrada.readLine());

            if ((entero % 6 == 0) && (entero % 7 == 0)) {
                System.out.println("El número es múltiplo de 6 y 7");
            }
            else {
                System.out.println("El número no es multiplo de 6 y 7");
            }

            if ((entero > 30) && (entero % 2 == 0)) {
                System.out.println("El número es mayor a 30 y múltiplo de 2");
            }
            else if (entero <= 30) {
                System.out.println("El número es menor o igual a 30");
            }

            if ((entero / 5) > 10) {
                System.out.println("El número dividido por 5 es mayor a 10");
            }
            else {
                System.out.println("El número dividido por 5 no es mayor a 10");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}