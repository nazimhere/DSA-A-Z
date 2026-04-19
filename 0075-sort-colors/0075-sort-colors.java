class Solution {
    public void sortColors(int[] nums) {
        int[] a = new int[nums.length];
        
        // Copy original
        for(int i = 0; i < nums.length; i++) {
            a[i] = nums[i];
        }
        
        // Bubble sort (multiple passes)
        for(int i = 0; i < a.length-1; i++) {
            for(int j = 0; j < a.length-1-i; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        // Copy back to original
        for(int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }
}