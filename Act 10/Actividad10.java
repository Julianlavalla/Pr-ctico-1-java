import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad10 {
    public static void main(String[] args) {
        
        int entero1;
        int entero2;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese un número entero: ");
            entero1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese otro número entero: ");
            entero2 = Integer.valueOf(entrada.readLine());

            if (entero1 > entero2) {
                System.out.println("el primer número es mayor que el segundo");
            }
            else 
                {
                    System.out.println("el primer número no es mayor que el segundo");
                }

            if ((entero1 % 2 == 0) && (entero2 % 2 == 0)) {
                System.out.println("Ambos son múltiplos de 2");
            }
            else {
                System.out.println("no son múltiplos de 2");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}