public class NotificadorWhatsApp implements Notificador {
    public void enviarMensaje(String mensaje) {
        System.out.println("💬 Enviando WhatsApp: " + mensaje);
    }
}
