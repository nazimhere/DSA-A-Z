class Solution {
    public int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;
        for(int num : nums) {
            int take = num + prev2;  // Rob this house
            int skip = prev1;        // Skip this house
            int current = Math.max(take, skip);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}