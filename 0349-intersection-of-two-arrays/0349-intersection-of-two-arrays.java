import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int x : nums1) {
            set1.add(x);
        }

        Set<Integer> intersection = new HashSet<>();
        for (int x : nums2) {
            if (set1.contains(x)) {
                intersection.add(x);
            }
        }

        return intersection.stream()
                           .mapToInt(Integer::intValue)
                           .toArray();
    }
}
