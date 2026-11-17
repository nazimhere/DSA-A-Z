class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);

        return new int[]{first, last};
    }

    private int binarySearch(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                answer = mid;

                if (findFirst) {
                    right = mid - 1; // first occurrence ke liye left jao
                } else {
                    left = mid + 1;  // last occurrence ke liye right jao
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}    
