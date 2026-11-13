class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> n=new ArrayList<>();
       
        for(int i=0;i<matrix.length;i++){ 
            int a=matrix[i][0];
            int f=0;
            for(int j=0;j<matrix[0].length;j++){
              if(a>matrix[i][j]) {
                a=matrix[i][j];
               f=j;
              } 
            
            }
        boolean isMax=true;
            for(int k=0;k<matrix.length;k++){
              if(a<matrix[k][f]) {
               isMax=false;
               break;
              } 
            }
           if(isMax){
            n.add(a);
           }
    }
    return n;
    }
}