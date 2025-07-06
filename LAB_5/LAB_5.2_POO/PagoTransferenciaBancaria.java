public class PagoTransferenciaBancaria implements MetodoPago {
    public void procesarPago(double monto) {
        System.out.println("🏦 Pagando $" + monto + " mediante transferencia bancaria.");
    }
}
