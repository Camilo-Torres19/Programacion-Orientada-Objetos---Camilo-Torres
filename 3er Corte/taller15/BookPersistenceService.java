public class BookPersistenceService {
    private Book book;

    public BookPersistenceService(Book book) {
        this.book = book;
    }

    public void saveBook() {
        System.out.println("Guardando libro en la base de datos");
    }
}
