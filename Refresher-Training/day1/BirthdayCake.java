package day1;

import java.util.Scanner;

public class BirthdayCake {

    public static int birthdayCakeCandles(int[] candles) {

        int tallest = candles[0];

        // Find tallest candle
        for (int candle : candles) {
            if (candle > tallest) {
                tallest = candle;
            }
        }

        // Count tallest candles
        int count = 0;
        for (int candle : candles) {
            if (candle == tallest) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] candles = new int[n];

        for (int i = 0; i < n; i++) {
            candles[i] = sc.nextInt();
        }

        int result = birthdayCakeCandles(candles);

        System.out.println(result);

        sc.close();
    }
}