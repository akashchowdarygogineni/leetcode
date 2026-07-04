class Solution {
    public void rotate(int[] nums, int k) {
   
    int n=nums.length;
     k=k%n;
     //reverse the n-d elemnts which are at the first
       reverse(nums,0,n-k-1);
      //we want to revrese the k elemnts which are at the last
       reverse(nums,n-k,n-1);
       //then reverse the entire n elemnts 
       reverse(nums,0,n-1);
      
        
    }
    public static void reverse(int[] nums,int start,int end)
    {
        //after calling these function it is reversed
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
   
    }
}