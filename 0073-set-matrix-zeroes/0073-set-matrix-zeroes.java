class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;        // number of rows
        int n = matrix[0].length;     // number of columns

        boolean[] zeroRows = new boolean[m];   // length m
        boolean[] zeroCols = new boolean[n];   // length n

        // First pass: find which rows and cols have zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Second pass: actually set 0s in matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}