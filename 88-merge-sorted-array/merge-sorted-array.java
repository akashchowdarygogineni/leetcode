class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {

      
       int len=(n+m);

       int gap=(len/2)+(len%2);

       while(gap>0)
       {
         int left=0;
         int right=gap;

         while(right<len)
         {
            //left is at arr1 and right is at arr2
            if(left<m && right>=m)
            {
               swapIfgreater(arr1,arr2,left,right-m);
            }

            //left is at arr2 and right is at arr2
            else if(left>=m && right>=m)
            {
                swapIfgreater(arr2,arr2,left-m,right-m);
            }

            //both on the left
            else{
                swapIfgreater(arr1,arr1,left,right);
            }
            left++;
            right++;
         }
         if(gap==1)
         {
            break;
         }
         gap=(gap/2)+(gap%2);
       }

       //place the all the elemnts of array2 in array1

       for(int k=0;k<n;k++)
       {
         arr1[m++]=arr2[k];
       }
         
        
    }

     public static void swapIfgreater(int[] arr1,int[] arr2,int left,int right)
    {
        if(arr1[left]>arr2[right])
        {
            //swap
            int temp=arr1[left];
            arr1[left]=arr2[right];
            arr2[right]=temp;
        }
    }
}