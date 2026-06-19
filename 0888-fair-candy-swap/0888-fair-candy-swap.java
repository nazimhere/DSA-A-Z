class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // Calculate total candies for Alice and Bob
        int sumA = 0;
        for (int a : aliceSizes) sumA += a;
        
        int sumB = 0;
        for (int b : bobSizes) sumB += b;
        
        // The difference needed to equalize totals
        int delta = (sumA - sumB) / 2;
        
        // Store Alice's candies in a HashSet for O(1) lookup
        Set<Integer> aliceSet = new HashSet<>();
        for (int a : aliceSizes) aliceSet.add(a);
        
        // Find the swap pair
        for (int b : bobSizes) {
            int needed = b + delta;
            if (aliceSet.contains(needed)) {
                return new int[]{needed, b};
            }
        }
        
        return new int[]{}; // No solution (though problem guarantees one exists)
    }
}