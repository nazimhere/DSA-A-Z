
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            target.add(index[i], nums[i]);  // Insert at specific index
        }
        int[] result = new int[nums.length];
        for(int i = 0; i < result.length; i++){
            result[i] = target.get(i);
        }
        return result;
    }
}
