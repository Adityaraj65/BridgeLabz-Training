package linear_and_binary_search;

import java.util.Scanner;

public class StringBufferVsStringBuilder {

    public static void main(String[] args) {

        // Scanner to take input
        Scanner sc = new Scanner(System.in);

        // Ask user how many times to concatenate
        System.out.print("Enter number of iterations: ");
        int n = sc.nextInt();

        // StringBuffer Test

        // Record start time
        long startBuffer = System.nanoTime();

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // Append strings
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        // Record end time
        long endBuffer = System.nanoTime();

        // StringBuilder Test

        // Record start time
        long startBuilder = System.nanoTime();

        // Create StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings
        for (int i = 0; i < n; i++) {
            stringBuilder.append("hello");
        }

        // Record end time
        long endBuilder = System.nanoTime();

        // Print execution times
        System.out.println("StringBuffer Time (ns): " + (endBuffer - startBuffer));
        System.out.println("StringBuilder Time (ns): " + (endBuilder - startBuilder));

        sc.close();
    }
}

