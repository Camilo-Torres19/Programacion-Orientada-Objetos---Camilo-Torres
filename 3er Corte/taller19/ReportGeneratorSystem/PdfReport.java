package ReportGeneratorSystem;

public class PdfReport implements ReportGenerator {

    @Override
    public void generate(String information) {
        System.out.println("Generando reporte PDF con información: " + information);
    }
    
}
