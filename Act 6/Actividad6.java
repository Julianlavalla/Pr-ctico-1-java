import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad6 {
    public static void main(String[] args) {
        String tipo_factura;
        int numero_factura;
        String nombre;
        String producto_1;
        float importe_1;
        String producto_2;
        float importe_2;
        float total;

        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Ingrese el tipo de factura: ");
            tipo_factura = entrada.readLine();
            System.out.println("Ingrese el número de factura (int): ");
            numero_factura = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese el nombre del cliente: ");
            nombre = entrada.readLine();
            System.out.println("ingrese el producto 1: ");
            producto_1 = entrada.readLine();
            System.out.println("Ingrese el importe 1 (float): ");
            importe_1 = Float.valueOf(entrada.readLine());
            System.out.println("Ingrese el producto 2: ");
            producto_2 = entrada.readLine();
            System.out.println("Ingrese el importe 2: ");
            importe_2 = Float.valueOf(entrada.readLine());
            total = importe_1 + importe_2;

            System.out.println("Factura" + "    " + tipo_factura + "    " + "N" + numero_factura + "\n" + //
                                "" + "Nombre:" + " " + nombre + "\n" + //
                                                                        "" + "Producto" + "    " + "Importe" + "\n" + //
                                                                                                                                                        "" + producto_1 + "    " + importe_1 + "\n" + //
                                                                                                                                                                                                                                                                                                                        "" + producto_2 + "    " + importe_2 + "\n" + //
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        "" + "Importe total" + " " + total);

        } catch (Exception exc) {

        }

    }
}