class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //we are doing the three sum of the arrays

      
        List<List<Integer>> li1=new ArrayList<List<Integer>>();

        HashSet<List<Integer>> set1=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> set=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                int target=-(nums[i]+nums[j]);

                if(set.contains(target))
                {
                    //triplet
                    ArrayList<Integer> li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(target);
                    Collections.sort(li);
                    set1.add(li);
                }
                set.add(nums[j]);
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