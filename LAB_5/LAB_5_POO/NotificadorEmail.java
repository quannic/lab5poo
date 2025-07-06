public class NotificadorEmail implements Notificador {
    public void enviarMensaje(String mensaje) {
        System.out.println("📧 Enviando Email: " + mensaje);
    }
}
