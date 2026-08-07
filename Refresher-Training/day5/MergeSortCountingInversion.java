package day5;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class MergeSortCountingInversion {
	 public static long countInversions(List<Integer> arr) {
	        int [] temp=new int[arr.size()];
	        return mergeSort(arr,temp,0,arr.size()-1);
	    // Write your code here

	    }
	    private static long mergeSort(List<Integer> arr,int[] temp,int left,int right){
	        long count=0;
	        if(left<right){
	            int mid=(left+right)/2;
	            //left half
	            count+=mergeSort(arr,temp,left,mid);
	            //right half
	            count=+mergeSort(arr, temp, mid+1, right);
	            count+=merge(arr,temp,left,mid,right);
	        }
	        return count;
	    }
	    private static long merge(List<Integer> arr,int[] temp,int left,int mid,int right){
	        int i=left;
	        int j=mid+1;
	        int k=left;
	        long count=0;
	        while(i<=mid&&j<=right){
	            if(arr.get(i)<=arr.get(j)){
	                temp[k]=arr.get(i);
	                i++;
	                k++;
	            }else{
	                temp[k]=arr.get(j);
	                count+=(mid-i+1);
	                j++;
	                k++;
	            }
	        }
	        while(i<=mid){
	            temp[k]=arr.get(i);
	            i++;
	            k++;
	        }
	        while(j<=right){
	            temp[k]=arr.get(j);
	            j++;
	            k++;
	        }
	        for(int x=left;x<=right;x++){
	            arr.set(x,temp[x]);
	        }
	        return count;
	    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                long result = countInversions(arr);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
