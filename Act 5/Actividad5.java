import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad5 {
    public static void main(String[] args) {
        String nombre;
        String edad;
        String altura;
        String ocupacion;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.readLine();
            System.out.println("Ingrese su edad: ");
            edad = entrada.readLine();
            System.out.println("Ingrese su altura: ");
            altura = entrada.readLine();
            System.out.println("Ingrese su ocupación : ");
            ocupacion = entrada.readLine();

            System.out.println(nombre + " " + edad + " " + altura + " " + ocupacion);

        } catch (Exception exc) {
            // TODO: handle exception
        }
    }
}
