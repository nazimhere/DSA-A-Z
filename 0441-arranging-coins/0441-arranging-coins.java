class Solution {
    public int arrangeCoins(int n) {
        int a=0;
        for( int i=0;i<n;i++){
            a+=i;
        
        if(a>n){
            return i-1;
        }
        } return a;
    }
}