package ReportGeneratorSystem;

public class Test {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new PdfReport();
        ReportGenerator reportGenerator2 = new ExcelReport();

        ReportManager reportManager = new ReportManager(reportGenerator);
        reportManager.generate("Información economica empresarial");
        reportManager = new ReportManager(reportGenerator2);
        reportManager.generate("Información gastos familiares");
    }
}
