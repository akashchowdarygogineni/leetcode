class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
       

       //take the fixed sliding window
       int left=0;
       int right=k-1;
       int count=0;
       int sum=0;
       for(int i=left;i<=right;i++)
       {
         sum+=arr[i];
       }
       if(sum/k>=t)
       {
        count++;
       }


       while(right<arr.length-1)
       {
         sum-=arr[left];
         left++;
         right++;
         sum+=arr[right];
         if(sum/k>=t)
         {
            count++;
         }
       
       }

       return count;
    }
}