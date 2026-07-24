class Solution {
    public void merge(int[] a, int m, int[] b, int n) {

       int left=m-1;
      
      int right=0;
      
      
      while(left>=0 && right<b.length)
      {
          if(a[left]>b[right])
          {
              //swap those elements
              int temp=a[left];
              a[left]=b[right];
              b[right]=temp;
              left--;
              right++;
              
          }
          else{
              break;
          }
      }
      

      //

      for(int i=0;i<b.length;i++)
      {
        a[m+i]=b[i];
      }
      Arrays.sort(a);
     
         
        
    }

    
}