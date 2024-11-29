package ReportGeneratorSystem;

public class ExcelReport implements ReportGenerator {

    @Override
    public void generate(String information) {
        System.out.println("Generando reporte Excel con información: " + information);
    }
    
}
