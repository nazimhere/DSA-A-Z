
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > nums.length / 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}
