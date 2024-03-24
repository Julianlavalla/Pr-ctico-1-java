import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

public class Bonus1 {
    public static void main(String[] args) {
        
        Date fecha = new Date();
        int numero_ticket;
        int cuit;
        final String nombre_cajero = "Gerónimo Benavidez";
        final int numero_caja = 8;
        int dni_cliente;
        final String leyenda = "El precio lo pone el cliente";

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese el número de ticket: ");
            numero_ticket = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el cuit del cliente: ");
            cuit = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el dni del cliente: ");
            dni_cliente = Integer.valueOf(entrada.readLine());

            System.out.println(fecha.toString() + "     " + "Ticket Nro. " + numero_ticket + "\n" + "          " + "CUIT: " + cuit + "\n" + "Cajero: " + nombre_cajero + "     " + "Caja: " + numero_caja + "\n" + "DNI: " + dni_cliente + "     " + leyenda);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}