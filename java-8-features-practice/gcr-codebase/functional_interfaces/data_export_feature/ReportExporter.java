package functional_interfaces.data_export_feature;

public interface ReportExporter {

    // Existing methods
    void exportToCSV();
    void exportToPDF();

    // New feature added later
    default void exportToJSON() {
        System.out.println("JSON export not supported for this report.");
    }
}
