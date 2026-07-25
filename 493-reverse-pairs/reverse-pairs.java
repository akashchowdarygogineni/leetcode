class Solution {
    static int  count=0;
    public int reversePairs(int[] arr) {
        count=0;
        int l=0;
        int r=arr.length-1;
        merge(arr,l,r);
        return count;
    }

      public static void merge(int[] arr,int l,int r)
    {
        //base condition
        if(l>=r)
        {
            return;
        }
        
        int mid=(l+r)/2;
        
        //for the left part
        merge(arr,l,mid);
        
        //for the right part
        merge(arr,mid+1,r);
        

        //before that what we are doing counting inversions
        reversepaircount(arr,l,mid,r);
        //merge the two arrays
        mergearrays(arr,l,mid,r);
    }
   

   public static void reversepaircount(int[] arr,int l,int mid,int r)
   {
      
      //now what i am doing i am counting the reverse pairs
      int left=l;
      int right=mid+1;

      for(left=l;left<=mid;left++)
      {
        while(right<=r && arr[left]>2L*(long)arr[right])
        {
         
      
          right++;
      
          
        }
        count+=(right-(mid+1));
      }
  }

       
    public static void mergearrays(int[] arr,int l,int mid,int r)
    {
        int left=l;
        int right=mid+1;
        
        //craete the arraylist to store the elemnts temproray
        ArrayList<Integer> li=new ArrayList<>();
        
        //travresing over the left and the right of the two  arrays
        while(left<=mid && right<=r)
        {
            if(arr[left]<=arr[right])
            {
                li.add(arr[left]);
                left++;
            }
            else{
                li.add(arr[right]);
            
                right++;
            }
        }
        
        //if the elemnts remaing on the left half
        while(left<=mid)
        {
            li.add(arr[left]);
            left++;
        }
        
        //if the elemnts are remainig in teh right half
        while(right<=r)
        {
            li.add(arr[right]);
            right++;
        }
        
        //push these arraylist elemnts into the original array
        int j=0;
        for(int i=l;i<=r;i++)
        {
            arr[i]=li.get(j);
            j++;
            
        }
    }
}