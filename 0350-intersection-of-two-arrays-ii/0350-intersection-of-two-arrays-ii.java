import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for (int s : nums1) {
            ar.add(s);
        }

        ArrayList<Integer> sa = new ArrayList<Integer>();
        for (int s : nums2) {
            if (ar.contains(s)) {
                sa.add(s);
                ar.remove(Integer.valueOf(s)); // fix
            }
        }

        return sa.stream()
                 .mapToInt(Integer::intValue)
                 .toArray();
    }
}

