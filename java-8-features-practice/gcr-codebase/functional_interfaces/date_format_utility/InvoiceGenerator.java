package functional_interfaces.date_format_utility;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {
        LocalDate invoiceDate = LocalDate.now();
        // Different date formats required by invoice generator
        String format1 = DateUtils.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateUtils.formatDate(invoiceDate, "yyyy-MM-dd");
        String format3 = DateUtils.formatDate(invoiceDate, "dd MMM yyyy");
        System.out.println("Invoice Date (dd-MM-yyyy): " + format1);
        System.out.println("Invoice Date (yyyy-MM-dd): " + format2);
        System.out.println("Invoice Date (dd MMM yyyy): " + format3);
    }
}

