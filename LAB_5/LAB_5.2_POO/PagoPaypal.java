public class PagoPaypal implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("💻 Pagando $" + monto + " usando PayPal.");
    }
}
