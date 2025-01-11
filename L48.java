class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = m;

        //Transpose

        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reverse
        for (int i = 0; i < m; i++) {
            for (int j = 0, k = m - 1; j < k; j++, k--) { // Reverse elements in the row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
    }
    }
}
