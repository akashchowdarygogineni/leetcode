class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] newarr=new int[nums.length];
        int j=newarr.length-1;
        
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
          int leftvalue=nums[left]*nums[left];
          int rightvalue=nums[right]*nums[right];
          if(rightvalue>leftvalue)
          {
            newarr[j]=rightvalue;
            right--;
          }
          else{
            newarr[j]=leftvalue;
            left++;
          }
          j--;
        }
        newarr[j]=nums[left]*nums[left];
        return newarr;
    }
}