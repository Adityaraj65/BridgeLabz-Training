package day4;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class BubbleSort {
	 public static void countSwaps(List<Integer> a) {
		    // Write your code here
		    int count=0;
		    for(int i=0;i<a.size();i++){
		        for(int j=0;j<a.size()-1;j++){
		            if(a.get(j)>a.get(j+1)){
		                count++;
		                int temp=a.get(j);
		                a.set(j,a.get(j+1));
		                a.set(j+1,temp);
		            }
		        }
		        
		    }
		    System.out.println("Array is sorted in "+count+" swaps.");
		    System.out.println("First Element: "+a.get(0));
		    System.out.println("Last Element: "+a.get(a.size()-1));

		    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        countSwaps(a);

        bufferedReader.close();
    }
}
