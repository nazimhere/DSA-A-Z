class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=0;
        int[] arr=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            int a=0;
            for(int j=0;j<accounts[i].length;j++){
                a+=accounts[i][j];       
            }
            arr[i]=a;
        m= Math.max(a,m);
        }
        return m;
    }
}