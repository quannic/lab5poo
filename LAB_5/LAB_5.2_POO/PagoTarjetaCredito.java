public class PagoTarjetaCredito extends PagoTarjeta {
    public void procesarPago(double monto) {
        if (confirmarTransaccionAlta(monto)) {
            System.out.println("💳 Pagando $" + monto + " con tarjeta de crédito.");
        } else {
            System.out.println("❌ Transacción cancelada.");
        }
    }
}
