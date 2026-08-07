package day5;



import java.util.*;
public class QuickSort2 {

    static void quickSort(int[] ar) {
        quickSortHelper(ar);

    }
    static int[] quickSortHelper(int[] arr){
        if(arr.length<=1){
            return arr;
        }
        int pivot=arr[0];
        List<Integer>left=new ArrayList<>();
        List<Integer>right=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]<pivot){
                left.add(arr[i]);

            }else{
                right.add(arr[i]);
            }
        }
        int[] leftArr=new int[left.size()];
        for(int j=0;j<left.size();j++){
            leftArr[j]=left.get(j);
        }
        int[] rightArr=new int[right.size()];
        for(int k=0;k<right.size();k++){
            rightArr[k]=right.get(k);
        }
        leftArr=quickSortHelper(leftArr);
        rightArr=quickSortHelper(rightArr);
        int[] result=new int[arr.length];
        int l=0;
        for(int l1:leftArr){
            result[l]=l1;
            l++;
        }
        result[l++]=pivot;
        for(int l2:rightArr){
            result[l++]=l2;
        }
        printArray(result);
        return result;

    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar);
    }
}
