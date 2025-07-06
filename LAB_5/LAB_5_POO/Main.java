import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 1) Lista de mensajes
        List<String> mensajes = new ArrayList<String>();
        mensajes.add("Hola!");
        mensajes.add("Este es un mensaje de prueba para WhatsApp.");
        mensajes.add("Este mensaje es más largo y detallado, por lo tanto se debería enviar por email.");

        // Instancias de los notificadores
        Notificador notificadorSMS = new NotificadorSMS();
        Notificador notificadorWhatsapp = new NotificadorWhatsApp();
        Notificador notificadorEmail = new NotificadorEmail();

        // 2) Enviar todos los mensajes con cada notificador
        System.out.println("=== Enviando con cada notificador ===");
        for (String mensaje : mensajes) {
            notificadorSMS.enviarMensaje(mensaje);
            notificadorWhatsapp.enviarMensaje(mensaje);
            notificadorEmail.enviarMensaje(mensaje);
        }

        // 3) Lógica dinámica según longitud
        System.out.println("\n=== Enviando con lógica dinámica ===");
        for (String mensaje : mensajes) {
            Notificador notificadorElegido;
            if (mensaje.length() < 20) {
                notificadorElegido = notificadorSMS;
            } else if (mensaje.length() <= 100) {
                notificadorElegido = notificadorWhatsapp;
            } else {
                notificadorElegido = notificadorEmail;
            }
            notificadorElegido.enviarMensaje(mensaje);
        }
    }
}
    