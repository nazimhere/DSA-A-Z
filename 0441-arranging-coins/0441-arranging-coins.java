class Solution {
    public int arrangeCoins(int n) {
        int cnt=0;
        int temp=1;
        while(n-temp>=0) {
            n -= temp;
            cnt++;
            temp++;
        }
        return cnt;
    }
}