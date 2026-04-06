class Solution {
    public int findNumbers(int[] nums) {
       int d=0;  
       for(int i=0;i<nums.length;i++){
            int b=0;
           
           int a= nums[i];
           while(a>0){
            a/=10;b++;
           }
           if(b%2==0){
             d++;
           }
        }
        return d;
    }
}