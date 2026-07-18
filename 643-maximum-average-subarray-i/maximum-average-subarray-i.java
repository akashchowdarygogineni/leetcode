class Solution {
    public double findMaxAverage(int[] arr, int k) {
       
       //i am creating the fixed window

       int left=0;
       int right=k-1;

       int sum=0;
       for(int i=0;i<=right;i++)
       {
        sum+=arr[i];
       }


       int maxsum=sum;


       while(right<arr.length-1)
       {
        
         sum=sum-arr[left];
         left++;
         right++;
         sum+=arr[right];
          if(sum>maxsum)
         {
            maxsum=sum;
         }
       }

       return (double)maxsum/k;
    }
}