public class Duck implements Flying, Swimming {

    @Override
    public void fly(){
        System.out.println("El pato esta volando");
    }

    @Override
    public void swim(){
        System.out.println("El pato esta nadando");
    }
    
}
