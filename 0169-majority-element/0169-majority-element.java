class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer> freq=new HashMap<>();
        int max=0;
        for(int i=0;i<n;i++){
            int count=0;

            
            freq.put(nums[i],freq.getOrDefault(nums[i],count)+1);

            if (freq.get(nums[i]) > nums.length / 2) {
                return nums[i];}

        }
        return -1;
    }
}