public class NotificadorSMS implements Notificador {
    public void enviarMensaje(String mensaje) {
        System.out.println("📱 Enviando SMS: " + mensaje);
    }
}
