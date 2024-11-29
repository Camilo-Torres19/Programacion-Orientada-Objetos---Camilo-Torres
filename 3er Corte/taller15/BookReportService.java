public class BookReportService {
    private Book book;

    public BookReportService(Book book) {
        this.book = book;
    }

    public void generateReport() {
        System.out.println("Generando informe del libro");
    }
}
