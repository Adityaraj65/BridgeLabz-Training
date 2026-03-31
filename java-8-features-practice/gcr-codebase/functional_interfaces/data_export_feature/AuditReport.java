package functional_interfaces.data_export_feature;

public class AuditReport implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Exporting audit report to CSV");
    }
    @Override
    public void exportToPDF() {
        System.out.println("Exporting audit report to PDF");
    }
    @Override
    public void exportToJSON() {
        System.out.println("Exporting audit report to JSON");
    }
}
