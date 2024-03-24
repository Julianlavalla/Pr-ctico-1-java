import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bonus3 {
    public static void main(String[] args) {
        
        int dia;
        int importe;
        int numero_ticket;
        int dni_cliente;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Ingrese el día (viernes 1) (sabado 2): ");
            dia = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el importe: ");
            importe = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el numero de ticket: ");
            numero_ticket = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el dni del cliente: ");
            dni_cliente = Integer.valueOf(entrada.readLine());

            if ((dia == 1) || (dia == 2) && (numero_ticket % 2 == 0) && (importe <= 15000) && (dni_cliente % 2 == 1)) {
                System.out.println("Aplica descuento del 8%");
            }
            else {
                System.out.println("no aplica descuento");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}