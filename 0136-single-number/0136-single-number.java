import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();

        // Count how many times each number appears
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }

        // Find the number that appears only once
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (count.get(num) == 1) {
                return num;
            }
        }

        return -1; // This will not happen for valid input
    }
}