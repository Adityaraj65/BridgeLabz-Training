package csv_data_handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ValidateDataBeforeProcessing {

    public static void main(String[] args) {

        String filePath = "users.csv";
        String line;

        // regex rules
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "\\d{10}";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            // header skip
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String name = data[1];
                String email = data[2];
                String phone = data[3];
                boolean isValid = true;

                // email validation
                if (!email.matches(emailRegex)) {
                    System.out.println("Invalid Email in row: " + line);
                    isValid = false;
                }
                // phone validation
                if (!phone.matches(phoneRegex)) {
                    System.out.println("Invalid Phone Number in row: " + line);
                    isValid = false;
                }
                if (!isValid) {
                    System.out.println("Error: Data validation failed\n");
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

