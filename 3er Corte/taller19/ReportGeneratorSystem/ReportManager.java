package ReportGeneratorSystem;

public class ReportManager {

    private ReportGenerator reportGenerator;

    public ReportManager(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generate(String information) {
        reportGenerator.generate(information);
    }
}
