class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
           List<List<Integer>> li1=new ArrayList<List<Integer>>();

        HashSet<List<Integer>> set1=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            
            for(int j=i+1;j<nums.length;j++)
            {
                HashSet<Long> set=new HashSet<>();
                for(int k=j+1;k<nums.length;k++)
                {

                long x=(long)target-((long)nums[i]+(long)nums[j]+(long)nums[k]);

                if(set.contains(x))
                {
                    //triplet
                    ArrayList<Integer> li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    li.add((int)x);
                    Collections.sort(li);
                    set1.add(li);
                }
                set.add((long)nums[k]);
                }
            }
        }

        //then
        for(List<Integer> it:set1)
        {
            li1.add(it);
        }
        return li1;
    }
}