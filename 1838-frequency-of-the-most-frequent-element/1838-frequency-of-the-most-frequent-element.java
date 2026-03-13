class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, ans = 1;
        long sum = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            // Cost to make all elements in window equal to nums[right]:
            // nums[right] * windowSize - sum
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}