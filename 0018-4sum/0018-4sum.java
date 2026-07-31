class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> h = new ArrayList<>();

        Arrays.sort(nums);   // FIX: must sort before using duplicate-skip logic and two pointers

        for (int i = 0; i < n; i++) {

            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) {   // FIX: guard i>0 before touching nums[i-1]; compare 'a' not raw index
                continue;
            }

            for (int j = i + 1; j < n; j++) {   // FIX: added the missing second loop instead of nums[n-i]
                int b = nums[j];
                if (j > i + 1 && b == nums[j - 1]) {   // FIX: guard, and compare 'b' (not 'a') to skip dup b's
                    continue;
                }

                int s = j + 1;          // FIX: pointers must start after both fixed indices i and j
                int e = n - 1;          // FIX: end pointer is just the last index, not n-1-i

                while (s < e) {
                    long sum = (long) nums[s] + a + b + nums[e];  // FIX: long to avoid overflow
                    if (sum == target) {
                        h.add(Arrays.asList(a, b, nums[s], nums[e]));
                        while (s < e && nums[s] == nums[s + 1]) s++;  // FIX: skip dup s after a match
                        while (s < e && nums[e] == nums[e - 1]) e--;  // FIX: skip dup e after a match
                        s++;
                        e--;
                    } else if (sum < target) {
                        s++;            // FIX: was completely missing -> caused infinite loop
                    } else {
                        e--;            // FIX: was completely missing -> caused infinite loop
                    }
                }
            }
        }
        return h;
    }
}