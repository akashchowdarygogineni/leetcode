class Solution {
    public void setZeroes(int[][] arr) {
       int m = arr.length;
        int n = arr[0].length;

        boolean[][] mark = new boolean[m][n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i][j] == 0)
                {
                    matR(mark, i);
                    matC(mark, j);
                }
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(mark[i][j])
                {
                    arr[i][j] = 0;
                }
            }
        }
    }

   public void matR(boolean[][] mark, int i)
    {
        for(int j = 0; j < mark[i].length; j++)
        {
            mark[i][j] = true;
        }
    }

    public void matC(boolean[][] mark, int j)
    {
        for(int i = 0; i < mark.length; i++)
        {
            mark[i][j] = true;
        }
    }
}