class Solution {
    public int[][] generateMatrix(int n) {
        int s=n*n;
   int[][] a=new int[n][n];
    int top=0;
    int right=n-1;
    int bottom=n-1;
    int left=0;
    int sum=1;

    while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            a[top][i]=sum++;
        }
        top++;
     
        for(int i=top;i<=bottom;i++){
            a[i][right]=sum++;
        }
        right--;
     
        if(top<=bottom){
        for(int i=right;i>=left;i--){
            a[bottom][i]=sum++;
        }
        bottom--;

        if(left<=right){
        for(int i=bottom;i>=top;i--){
            a[i][left]=sum++;
        }
        left++;
        }

    }
    }
    return a;
     }
}