package MessageSystem;

public class MessageEmail extends Messenger {

    @Override
    public void send(String message) {
        System.out.println("Enviando mensaje por correo: "+ message);
    }
    
}
