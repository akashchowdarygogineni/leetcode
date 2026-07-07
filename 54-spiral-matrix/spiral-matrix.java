class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> li=new ArrayList<>();
        int top=0;
        int bottom=arr.length-1;

        int left=0;
        int right=arr[0].length-1;

       while(left<=right && top<=bottom)
       {
        for(int i=left;i<=right;i++)
        {
            li.add(arr[top][i]);
        }

        top++;

        for(int i=top;i<=bottom;i++)
        {
            li.add(arr[i][right]);
        }
        right--;
       
       if(top<=bottom)
       {
        for(int i=right;i>=left;i--)
        {
            li.add(arr[bottom][i]);
        }
        bottom--;
       }


       if(left<=right)
       {
        for(int i=bottom;i>=top;i--)
        {
           li.add(arr[i][left]);
        }
        left++;
       }
       }


       return li;
    }
}