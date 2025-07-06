public class PagoTarjetaDebito extends PagoTarjeta {
    public void procesarPago(double monto) {
        if (confirmarTransaccionAlta(monto)) {
            System.out.println("💳 Pagando $" + monto + " con tarjeta de débito.");
        } else {
            System.out.println("❌ Transacción cancelada.");
        }
    }
}
