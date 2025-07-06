import java.util.Scanner;

public abstract class PagoTarjeta implements MetodoPago {
    protected boolean confirmarTransaccionAlta(double monto) {
        if (monto > 500000) {
            Scanner sc = new Scanner(System.in);
            System.out.println("⚠ El monto supera los $500000. ¿Está seguro de realizar esta transacción? (s/n)");
            String respuesta = sc.nextLine();
            return respuesta.equalsIgnoreCase("s");
        }
        return true;
    }
}
