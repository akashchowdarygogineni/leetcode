class Solution {
    public int[] twoSum(int[] nums, int k) {
     
   HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int target=k-nums[i];

            if(map.containsKey(target))
            {
                return new int[]{map.get(target),i};
            }
            else{
                map.put(nums[i],i);
            }
        }

        return new int[]{-1,-1};
    }
}