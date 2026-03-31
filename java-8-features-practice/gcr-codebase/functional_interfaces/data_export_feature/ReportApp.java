package functional_interfaces.data_export_feature;
public class ReportApp {

    public static void main(String[] args) {
        ReportExporter sales = new SalesReport();
        sales.exportToCSV();
        sales.exportToJSON();   // default method
        ReportExporter audit = new AuditReport();
        audit.exportToJSON();   // overridden
    }
}
