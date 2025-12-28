class Solution {
    
    public static long countpairs(int[] nums,int sum)
    {
      
        int left=0;
        int right=nums.length-1;
        long count=0;
        while(left<right)
        {
            if(nums[left]+nums[right]>sum)
            {
                right--;
            }
            else{
                count+=right-left;
                left++;
            }
        }
        return count;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        
        Arrays.sort(nums);

        long lowerpairs=countpairs(nums,lower-1);

        long upperpairs=countpairs(nums,upper);

        return upperpairs-lowerpairs;
    }
}