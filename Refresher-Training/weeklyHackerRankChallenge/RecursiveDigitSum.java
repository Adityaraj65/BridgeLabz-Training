package weeklyHackerRankChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class RecursiveDigitSum {
	 public static int superDigit(String n, int k) {
		    // Write your code here
		    if(n.length()==1){
		        return Integer.parseInt(n);
		    }
		    long sum=0;
		    for(char c:n.toCharArray()){
		        sum+=c-'0';
		    }
		    sum=sum*k;
		    return superDigit(Long.toString(sum),1);

		    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

