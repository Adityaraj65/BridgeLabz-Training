package linear_and_binary_search;

import java.util.Scanner;

public class StringBufferConcat {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for number of strings
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Create array to store strings
        String[] arr = new String[n];

        // Take string inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append each string to StringBuffer
        for (String s : arr) {
            sb.append(s);
        }

        // Convert StringBuffer to String
        String result = sb.toString();

        // Print concatenated result
        System.out.println("Concatenated String: " + result);

        sc.close();
    }
}

