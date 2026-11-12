class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int a = image[i][cols - 1 - j]; // read row in reverse

                arr[i][j] = 1 - a;              // invert 0 to 1, 1 to 0
            }
        }

        return arr;
    }
}
