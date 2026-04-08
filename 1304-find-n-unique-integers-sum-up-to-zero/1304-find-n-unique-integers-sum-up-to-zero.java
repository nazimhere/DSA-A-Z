class Solution {
    public int[] sumZero(int n) {
        int[] as=new int[n];
        int a=n/2;
        for(int i=1;i<=a;i++){
        as[i-1]=i;
        }
        for(int j=a;j>0;j--){
            as[n-j]=-j;
        }
       
        return as;
       
    }
}