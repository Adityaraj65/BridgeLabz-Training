package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        
    int value = arr.get(n - 1);
    for (int i = n - 2; i >= 0; i--) {
        if (arr.get(i) > value) {
            arr.set(i + 1, arr.get(i));
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        else {
            arr.set(i + 1, value);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
    }
    arr.set(0, value);
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
}

public class InsertionSortPart1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}

