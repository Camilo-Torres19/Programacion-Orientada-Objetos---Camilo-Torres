package DocumentManagement;

public class Test {
    public static void main(String[] args) {
        Document document = new DocumentPDFFormat();
        
        
        DocumentService documentService = new DocumentService();
        documentService.export(document);
    }
}
