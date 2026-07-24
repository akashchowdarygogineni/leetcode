class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //we are doing the three sum of the arrays

        Arrays.sort(nums);
        List<List<Integer>> li=new ArrayList<List<Integer>>();


        for(int i=0;i<nums.length-1;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0)
                {
                    j++;
                }
                else if(sum>0)
                {
                    k--;
                }
                else{
                    ArrayList li1=new ArrayList<>();
                    li1.add(nums[i]);
                    li1.add(nums[j]);
                    li1.add(nums[k]);
                    li.add(li1);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                      while(k>j && nums[k]==nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }

        return li;
 
    }
}