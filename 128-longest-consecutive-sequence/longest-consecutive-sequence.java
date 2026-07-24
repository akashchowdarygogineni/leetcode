class Solution {

   
    public int longestConsecutive(int[] nums) {
     
        if(nums.length==0)
        {
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();

        int longest=1;

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }


        //then iterate over the set

        for(int it:set)
        {
            int count=1;
            int x=it;
            if(!set.contains(x-1))
            {
                x=x+1;
                while(set.contains(x))
                {
                    count++;
                    x=x+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}