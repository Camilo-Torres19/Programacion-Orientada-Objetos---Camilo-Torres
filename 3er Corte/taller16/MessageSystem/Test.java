package MessageSystem;

public class Test {
    public static void main(String[] args) {
        Messenger messenger = new MessageSMS();
        Messenger messenger1 = new MessageEmail();
        Messenger messenger2 = new MessageWhatsApp();

        MessageManager messageManager = new MessageManager();
        messageManager.send(messenger, "Hola");
        messageManager.send(messenger1, "Hola");
        messageManager.send(messenger2, "Hola");
    }
}
