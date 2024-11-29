package StorageSystem;

public class CloudStorage implements Storage {

    @Override
    public void save(String archivo) {
        System.out.println("Guardando archivo '"+ archivo +"' en el sistema de la nube"); 
    }

    @Override
    public void restore(String archivo) {
        System.out.println("Restaurando archivo '"+ archivo +"' del sistema de la nube");
    }
    
}
