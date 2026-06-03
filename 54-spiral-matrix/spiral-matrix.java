class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> li=new ArrayList<>();
        
        int n=matrix.length;
        int m=matrix[0].length;
        
        int left=0;
        int right=m-1;
        int top=0;
        int bottom=n-1;

        if(n==1)
        {
            for(int j=0;j<m;j++)
            {
                li.add(matrix[0][j]);
            }
             return li;
        }
       
        if(m==1)
        {
            for(int i=0;i<n;i++)
            {
                li.add(matrix[i][0]);
            }
            return li;
        }
        
        
  while(left<=right && top<=bottom)
    {
        for(int i=left;i<=right;i++)
        {
            li.add(matrix[top][i]);
        }
        top++;
        
        for(int i=top;i<=bottom;i++)
        {
            li.add(matrix[i][right]);
        }
        right--;
        
        if(top <= bottom){
        
             for(int i=right;i>=left;i--)
             {
              li.add(matrix[bottom][i]);
            
             }
            bottom--;  }
        
     
        
       
        if(left<=right){
           for(int i=bottom;i>=top;i--)
            {
             li.add(matrix
             [i][left]);
            }
           left++;  
        }
        
        
        
 
    }
    return li;
    }
}