public class BookInfoManagementService {

    private Book book;

    public BookInfoManagementService(Book book) {
        this.book = book;
    }

    public void printBookInfo() {
        System.out.println("Titulo: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Cantidad de paginas: " + book.getNumberOfPages());
    }
}
