package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'primality' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER n as parameter.
     */

    public static String primality(int n) {
    // Write your code here
    if(n<=1 &&n>=0){
        return "Not prime";
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return "Not prime";
        }
    }
    return "Prime";

    }

}

public class TimeComplexityPrimality {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        for (int pItr = 0; pItr < p; pItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String result = Result.primality(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
