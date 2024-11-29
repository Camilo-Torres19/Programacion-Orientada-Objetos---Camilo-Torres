public class People implements Talker, Worker {
    public void talk() {
        System.out.println("La persona esta hablando...");
    }

    public void work(){
        System.out.println("la persona esta trabajando...");
    }
}
