class Solution {
    public void merge(int[] a, int m, int[] b, int n) {

      
      int[] newarr=new int[m+n];
        
        int left=0;
        int right=0;
        
        int index=0;
        
        while(left<m && right<n)
        {
            if(a[left]<=b[right])
            {
                newarr[index]=a[left];
                left++;
                index++;
            }
            else{
                newarr[index]=b[right];
                right++;
                
                index++;
            }
        }
        
        while(left<m)
        {
            newarr[index]=a[left];
            left++;
            index++;
        }
        
        
        while(right<n)
        {
            newarr[index]=b[right];
        
            right++;
            index++;
        }
        
        //then what you are doing you are palcing these elements in the orginal arrays
        for(int i=0;i<newarr.length;i++)
        {
           
                a[i]=newarr[i];
            
            
            
        }
         
        
    }

    
}