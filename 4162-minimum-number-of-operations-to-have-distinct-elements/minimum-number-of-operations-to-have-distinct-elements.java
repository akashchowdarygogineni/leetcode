class Solution {
    public int minOperations(int[] nums) {
         Set<Integer> set=new HashSet<>();

        int idx=nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
            {
                if(set.contains(nums[i]))
                {
                    break;
                    
                }
                set.add(nums[i]);
                idx=i;
            }

        return (idx+2)/3;
    }
}