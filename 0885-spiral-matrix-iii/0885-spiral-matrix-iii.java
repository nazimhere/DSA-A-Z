class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

      int[][] dirs={{0,1},{1,0},{0,-1},{-1,0}};   ///east,s,w,n

      int dir=0;
      int  idx=0;  //current position 
      int r=rStart;
      int c=cStart;
      int steps=1;

        int[][] res=new int[rows*cols][2];
       
        while(idx<rows*cols){
            for(int i=0;i<2;i++){     ///har step 2 bar chalega
               for(int j=0;j<steps;j++){

                if(r>=0  && r<rows && c<cols && c>=0){   
                  res[idx++]=new int[]{r,c};
                }
                  r += dirs[dir][0];
                    c += dirs[dir][1];
               }
                 dir = (dir + 1) % 4; // Turn
            }
            steps++; // Increase step count after every two turns
        }
        return res;
    }
}