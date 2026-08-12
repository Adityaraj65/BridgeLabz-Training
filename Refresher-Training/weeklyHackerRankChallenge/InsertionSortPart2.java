package weeklyHackerRankChallenge;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;


public class InsertionSortPart2 {
	public static void insertionSort2(int n, List<Integer> arr) {
	    // Write your code here
	    
	    for(int i=1;i<arr.size();i++){
	        int current=arr.get(i);
	        int j=i-1;
	        while(j>=0&&current<arr.get(j)){
	                arr.set(j+1, arr.get(j));
	                
	                j--;
	            
	        }
	        arr.set(j+1, current);
	        for(int num:arr){
	                System.out.print(num+" ");
	        }
	        System.out.println();          
	    }
	    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        insertionSort2(n, arr);

        bufferedReader.close();
    }
}

