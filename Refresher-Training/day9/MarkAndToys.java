package day9;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class MarkAndToys {
	public static int maximumToys(List<Integer> prices, int k) {
	    // Write your code here
	    int sum=0;
	    int count=0;
	    List<Integer>prefix=new ArrayList<>();
	    Collections.sort(prices);
	    for(int i=0;i<prices.size();i++){
	        sum+=prices.get(i);
	        prefix.add(sum);
	    }
	    for(int i=0;i<prefix.size();i++){
	        if(prefix.get(i)<=k){
	            count++;
	        }else{
	            return count;
	        }
	    }
	    return count;
	    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> prices = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = maximumToys(prices, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

