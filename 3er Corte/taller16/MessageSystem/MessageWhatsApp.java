package MessageSystem;

public class MessageWhatsApp extends Messenger {

    @Override
    public void send(String message) {
        System.out.println("Enviando mensaje por WhatsApp :"+ message);
    }
    
}
