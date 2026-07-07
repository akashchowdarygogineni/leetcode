class Solution {
    public int[] twoSum(int[] nums, int k) {
        
        int left=0;
        int right=nums.length-1;

        while(left<right)
        {
            if(nums[left]+nums[right]==k)
            {
                return new int[]{left+1,right+1};
            }
            else if(nums[left]+nums[right]>k)
            {
              right--;
            }
            else{
                left++;
            }
        }

        return new int[]{-1,-1};
    }
}