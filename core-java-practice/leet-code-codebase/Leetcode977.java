class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] num2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            num2[i]=nums[i]*nums[i];  // squaring each element of nums and storing it into num2
        }
        Arrays.sort(num2); //sorting num2 in non decreasing order
        return num2;  //returning num2 to main function
    }
}
