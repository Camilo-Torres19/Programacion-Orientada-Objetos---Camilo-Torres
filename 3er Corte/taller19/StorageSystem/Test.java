package StorageSystem;

public class Test {
    public static void main(String[] args) {
        Storage storage = new LocalStorage();
        Storage storage2 = new CloudStorage();

        ArchiveManager archiveManager = new ArchiveManager(storage);
        archiveManager.save("MY VIDEO JUEGO FAVORITO.APP");
        archiveManager = new ArchiveManager(storage2);
        archiveManager.save("MY CANCIÓN FAVORITA.MP3");
    }
}
