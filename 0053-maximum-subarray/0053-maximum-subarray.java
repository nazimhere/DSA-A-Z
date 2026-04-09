class Solution {
    public int maxSubArray(int[] nums) {
        int a=0;
      int  maxSum=nums[0];
       for(int i=0;i<nums.length;i++){
        a=Math.max(nums[i],a+nums[i]);
        maxSum = Math.max(maxSum, a);
        
       }
       return maxSum;
        
    }
}