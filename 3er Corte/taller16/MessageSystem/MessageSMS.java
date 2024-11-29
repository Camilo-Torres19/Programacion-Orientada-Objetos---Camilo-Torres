package MessageSystem;

public class MessageSMS extends Messenger {

    @Override
    public void send(String message) {
        System.out.println("Enviando mensaje por SMS: "+ message);
    }
    
}
