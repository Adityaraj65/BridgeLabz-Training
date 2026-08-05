package day4;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;



public class RunningTimeOfAlgorithm {
	public static int runningTime(List<Integer> arr) {
        int count=0;
         for(int i=1;i<arr.size();i++){
                int current=arr.get(i);
                int j=i-1;
                while(j>=0&&current<arr.get(j)){
                        arr.set(j+1, arr.get(j));
                        count++;
                        
                        j--;
                    
                }
                arr.set(j+1, current);
         }
         return count;
    // Write your code here

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

