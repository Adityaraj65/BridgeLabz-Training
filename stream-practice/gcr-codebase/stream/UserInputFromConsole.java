package stream;
import java.io.*;

public class UserInputFromConsole {

    public static void main(String[] args) {

        // Reader to take input from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // File name where data will be saved
        String fileName = "user_details.txt";

        try {
            // Ask user details
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Writer to write data into file
            FileWriter writer = new FileWriter(fileName);

            // Write user data into file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            // Close writer
            writer.close();

            System.out.println("User details saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while reading input or writing file.");
            e.printStackTrace();
        }
    }
}
