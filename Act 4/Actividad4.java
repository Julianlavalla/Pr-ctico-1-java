import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad4 {
    public static void main(String[] args) {
        int entero_0;
        int entero_1;
        int entero_2;
        int entero_3;
        int entero_4;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el primer número: ");
            entero_0 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el segundo número: ");
            entero_1 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el tercer número: ");
            entero_2 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el cuarto número: ");
            entero_3 = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el quinto número: ");
            entero_4 = Integer.valueOf(entrada.readLine());

            System.out.println(entero_4 + " " + entero_3 + " " + entero_2 + " " + entero_1 + " " + entero_0);
        } catch (Exception exc) {
           System.out.println(exc);
    }
}
}