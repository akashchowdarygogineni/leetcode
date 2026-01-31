class Solution {
    public void rotate(int[][] matrix) {
        
        int n=matrix.length;
        int[][] temp=new int[n][n];

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                temp[j][matrix.length-i-1]=matrix[i][j];
            }
        }

          // Copy back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}