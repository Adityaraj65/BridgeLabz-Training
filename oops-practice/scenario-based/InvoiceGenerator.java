// Custom exception for wrong invoice format
class InvalidInvoiceFormatException extends Exception {

    public InvalidInvoiceFormatException(String message) {
        super(message);
    }
}

// Main class
public class InvoiceGenerator {

    // Splits input into individual task entries
    static String[] parseInvoice(String input) throws InvalidInvoiceFormatException {

        // Basic validation
        if (input == null || input.trim().isEmpty()) {
            throw new InvalidInvoiceFormatException("Invoice input is empty");
        }

        // Split by comma to separate tasks
        String[] tasks = input.split(",");

        for (String task : tasks) {

            // Each task must contain a dash and amount
            if (!task.contains("-")) {
                throw new InvalidInvoiceFormatException("Missing '-' in task: " + task);
            }

            String[] parts = task.split("-");

            if (parts.length < 2) {
                throw new InvalidInvoiceFormatException("Invalid task format: " + task);
            }

            // Amount must be present
            String amountPart = parts[1].replaceAll("[^0-9]", "").trim();

            if (amountPart.isEmpty()) {
                throw new InvalidInvoiceFormatException("Missing amount in task: " + task);
            }
        }

        return tasks;
    }

    // Calculates total amount from parsed tasks
    static int getTotalAmount(String[] tasks) {

        int total = 0;

        for (String task : tasks) {

            // Extract number from task
            String amount = task.split("-")[1].replaceAll("[^0-9]", "").trim();
            total += Integer.parseInt(amount);
        }

        return total;
    }

    public static void main(String[] args) {

        String input = "Logo Design - 3000 INR, Web Page - 4500 INR";

        try {
            // Parse and validate invoice input
            String[] tasks = parseInvoice(input);

            // Calculate total invoice amount
            int totalAmount = getTotalAmount(tasks);

            System.out.println("Invoice Details:");
            for (String task : tasks) {
                System.out.println(task.trim());
            }

            System.out.println("Total Amount: " + totalAmount + " INR");

        } catch (InvalidInvoiceFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
