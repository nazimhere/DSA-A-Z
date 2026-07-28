class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList <Integer> s=new ArrayList<>(nums.length/2);
        ArrayList <Integer> e=new ArrayList<>(nums.length/2);
       int[] f=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                s.add(nums[i]);
            }
            else 
            e.add(nums[i]);
        }
           for(int i=0;i<s.size();i++){
              
              
                 f[2 * i] = s.get(i);       // even index: positive
            f[2 * i + 1] = e.get(i); 
            
           }
              return f;
        }
    }