import java.util.Scanner;

/*
 * @Joel Seura 21.556.232-8 
 */
public class Main {
    public static void main(String[] args) {
        double[] carrito = {15000, 300000, 750000}; // Montos del carrito

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el método de pago:");
        System.out.println("1 - Tarjeta de Débito");
        System.out.println("2 - Tarjeta de Crédito");
        System.out.println("3 - Transferencia Bancaria");
        System.out.println("4 - PayPal");

        int opcion = sc.nextInt();
        MetodoPago metodo = null;

        switch(opcion) {
            case 1:
                metodo = new PagoTarjetaDebito();
                break;
            case 2:
                metodo = new PagoTarjetaCredito();
                break;
            case 3:
                metodo = new PagoTransferenciaBancaria();
                break;
            case 4:
                metodo = new PagoPaypal();
                break;
            default:
                System.out.println("❌ Opción inválida.");
                return;
        }

        System.out.println("\nProcesando pagos del carrito:");
        for (double monto : carrito) {
            metodo.procesarPago(monto);
        }
    }
}
