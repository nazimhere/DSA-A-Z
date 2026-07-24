class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        int s=0;
       int count=0;
         for(int i=0;i<nums.length;i++){
           
            if(nums[i]==1){
                s++;
            freq.put(1,s);
            count=Math.max(s,count);
            }
            else{
                s=0;
            }

        }
        return count;
    }
}