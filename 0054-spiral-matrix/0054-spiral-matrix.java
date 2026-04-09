class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();

        int top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        int left=0;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){                          //top=towards right
               result.add(matrix[left][i]);
        }top++;

         for(int i=top;i<=bottom;i++){                          // towads bottom
               result.add(matrix[i][right]);
        }right--;

         if(top<=bottom) { for(int i=right;i>=left;i--){                          // towads left
               result.add(matrix[bottom][i]);
        }bottom--;}

         if(left<=right) { for(int i=bottom;i>=top;i--){                          // towads left
               result.add(matrix[i][left]);
        }left++;}




        }
return result;

    }
}