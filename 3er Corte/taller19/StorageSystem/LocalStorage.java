package StorageSystem;

public class LocalStorage implements Storage {

    @Override
    public void save(String archivo) {
        System.out.println("Guardando archivo '"+ archivo +"' en el sistema local");
    }

    @Override
    public void restore(String archivo) {
        System.out.println("Restaurando archivo '"+ archivo +"' del sistema local");
    }
    
}
