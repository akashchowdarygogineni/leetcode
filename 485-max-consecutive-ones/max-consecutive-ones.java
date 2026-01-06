class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    

        int count=0;
        int maxones=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                maxones=Math.max(maxones,count);
            }
            else{
                count=0;
            }
        }

        if(maxones==Integer.MIN_VALUE)
        {
            return 0;
        }
        return maxones;
    }
}