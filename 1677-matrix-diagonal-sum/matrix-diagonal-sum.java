class Solution {
    public int diagonalSum(int[][] mat) {
        
        
        int dsum=0;
        int adsum=0;
        for(int i=0;i<mat.length;i++)
        {
            dsum+=mat[i][i];
            adsum+=mat[i][mat.length-i-1];
        }

        int mid=mat.length/2;
        
        if(mat.length%2!=0){
        return dsum+adsum-mat[mid][mid];
        }

        else{
            return dsum+adsum;
        }
    }
}