
// 🔹 Interface with default method for JSON export
interface ReportExporter {
    void exportToCSV(String data);
    void exportToPDF(String data);

    // ✅ Added later without breaking old classes
    default void exportToJSON(String data) {
        System.out.println("Export to JSON not supported by this exporter.");
    }
}

// 🔹 CSV Exporter
class CSVExporter implements ReportExporter {
    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting report to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting report to PDF: " + data);
    }
    // ⚠️ No need to override JSON → default runs
}

// 🔹 PDF Exporter
class PDFExporter implements ReportExporter {
    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting report to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting report to PDF: " + data);
    }
    // ⚠️ Uses default JSON method
}

// 🔹 JSON Exporter (new feature)
class JSONExporter implements ReportExporter {
    @Override
    public void exportToCSV(String data) {
        System.out.println("Exporting report to CSV: " + data);
    }

    @Override
    public void exportToPDF(String data) {
        System.out.println("Exporting report to PDF: " + data);
    }

    // ✅ Override default to add JSON support
    @Override
    public void exportToJSON(String data) {
        System.out.println("Exporting report to JSON: { \"report\": \"" + data + "\" }");
    }
}

public class Report_Export {
    public static void main(String[] args) {
        String reportData = "Sales Report Q1";

        ReportExporter csv = new CSVExporter();
        ReportExporter pdf = new PDFExporter();
        ReportExporter json = new JSONExporter();

        System.out.println("=== CSV Exporter ===");
        csv.exportToCSV(reportData);
        csv.exportToPDF(reportData);
        csv.exportToJSON(reportData); // default runs

        System.out.println("\n=== PDF Exporter ===");
        pdf.exportToCSV(reportData);
        pdf.exportToPDF(reportData);
        pdf.exportToJSON(reportData); // default runs

        System.out.println("\n=== JSON Exporter ===");
        json.exportToCSV(reportData);
        json.exportToPDF(reportData);
        json.exportToJSON(reportData); // custom implementation
    }
}
