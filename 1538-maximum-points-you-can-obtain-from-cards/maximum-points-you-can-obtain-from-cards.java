class Solution {
    public int maxScore(int[] arr, int k) {

       
        int leftsum=0;
        int rightsum=0;

        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<k;i++)
        {
            leftsum+=arr[i];
        }
        maxsum=leftsum;
       
       int right=arr.length-1;

        for(int i=k-1;i>=0;i--)
        {
            leftsum-=arr[i];
            rightsum+=arr[right];
            right--;
            maxsum=Math.max(maxsum,leftsum+rightsum);
        }


        return maxsum;
    }
}