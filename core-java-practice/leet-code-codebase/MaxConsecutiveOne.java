import java.util.*;
public class MaxConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
        
        
        
    }
public static int findMaxConsecutiveOnes(int[] nums) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count+=1;
            }else{
                max=Math.max(count,max);
                count =0;
            }
           
        }
        return Math.max(max,count);
        
    }
}
