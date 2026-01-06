// Handles freelancer invoice operations
class FreelancerInvoiceService {

    // Splits input string into individual task entries
    public String[] parseInvoice(String input) {

        // Split tasks using comma
        return input.split(",");
    }

    // Calculates total amount from task list
    public int getTotalAmount(String[] tasks) {

        int total = 0;

        for (String task : tasks) {

            // Each task must contain task name and amount
            if (!task.contains("-")) {
                System.out.println("Invalid format found: " + task);
                continue;
            }

            String[] parts = task.split("-");

            // Safety check
            if (parts.length < 2) {
                System.out.println("Invalid task entry: " + task);
                continue;
            }

            // Extract only numbers from amount part
            String amountText = parts[1]
                    .replaceAll("[^0-9]", "")
                    .trim();

            // Skip if amount is missing
            if (amountText.isEmpty()) {
                System.out.println("Amount missing for task: " + task);
                continue;
            }

            total += Integer.parseInt(amountText);
        }

        return total;
    }
}

// Main class
public class FreelancerInvoiceApp {

    public static void main(String[] args) {

        // Input received from freelancer
        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";

        // Create service object
        FreelancerInvoiceService invoiceService = new FreelancerInvoiceService();

        // Parse invoice string
        String[] tasks = invoiceService.parseInvoice(input);

        // Display invoice details
        System.out.println("Invoice Details:");
        for (String task : tasks) {
            System.out.println(task.trim());
        }

        // Calculate and display total amount
        int totalAmount = invoiceService.getTotalAmount(tasks);
        System.out.println("Total Amount: " + totalAmount + " INR");
    }
}
