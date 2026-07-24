class Solution {
    public void merge(int[] a, int m, int[] b, int n) {

   
      
      
        int len=a.length;
        int gap=(len/2)+(len%2);
        
        
      
      while(gap>0) {
        
        int left=0;
        int right=left+gap;
        
        
        while(right<len)
        {
            //there are three cases 
            //if left is in a1 and right in a2
            
            if(left<m && right>=m)
            {
                swap(a,b,left,right-m);
            }
            
            //case 2 both in a2
            else if(left>=m)
            {
                swap(b,b,left-m,right-m);
            }
            
            
            //both in a1
            else{
                swap(a,a,left,right);
            }
            
            
            left++;
            right++;
        }
        if(gap==1)
        {
            break;
        }
        gap=(gap/2)+ (gap % 2);
    }


    for(int i=0;i<b.length;i++)
    {
        a[m+i]=b[i];
    }
        
         
        
    }
     public static void swap(int[] a,int[] b,int left,int right)
    {
        if(a[left]>b[right])
        {
            int temp=a[left];
            a[left]=b[right];
            b[right]=temp;
        }
    }
    
}