class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i--];   // add current digit into k
            }
            res.add(0, k % 10); // remainder is the current digit
            k /= 10;            // carry moves to next position
        }

        return res;
    }
}