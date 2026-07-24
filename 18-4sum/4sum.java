class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> li=new ArrayList<List<Integer>>();


        for(int i=0;i<nums.length-1;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<nums.length;j++)
            {

              if(j!=i+1 && nums[j]==nums[j-1])
              {
                continue;
              }
            int k=j+1;
            int l=nums.length-1;

            while(k<l)
            {
                long sum=nums[i];
                sum+=nums[j];
                sum+=nums[k];
                sum+=nums[l];
                if(sum<target)
                {
                    k++;
                }
                else if(sum>target)
                {
                    l--;
                }
                else{
                    ArrayList li1=new ArrayList<>();
                    li1.add(nums[i]);
                    li1.add(nums[j]);
                    li1.add(nums[k]);
                    li1.add(nums[l]);
                    li.add(li1);
                    k++;
                    l--;
                    while(k<l && nums[k]==nums[k-1])
                    {
                        k++;
                    }
                      while(l>k && nums[l]==nums[l+1])
                    {
                        l--;
                    }
                }


            }

            }
        }

        return li;
    }
}