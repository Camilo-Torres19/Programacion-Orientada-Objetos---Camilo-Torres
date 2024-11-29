package StorageSystem;

public class ArchiveManager {
    private Storage storage;

    public ArchiveManager(Storage storage) {
        this.storage = storage;
    }

    public void save(String archivo) {
        storage.save(archivo);
    }

    public void restore(String archivo) {
        storage.restore(archivo);
    }
}
