package functional_interfaces.data_export_feature;

public class SalesReport implements ReportExporter {
    @Override
    public void exportToCSV() {
        System.out.println("Exporting sales report to CSV");
    }
    @Override
    public void exportToPDF() {
        System.out.println("Exporting sales report to PDF");
    }
}

