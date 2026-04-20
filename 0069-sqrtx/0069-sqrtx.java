class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {    // mid*mid <= x, avoids overflow
                ans = mid;           // mid is valid; try to go higher
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}