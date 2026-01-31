class Solution {
    public void rotate(int[][] matrix) {
        //finding the transpose of the square matrix without using the extra variable
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse the each row of the array


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<matrix.length/2;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}