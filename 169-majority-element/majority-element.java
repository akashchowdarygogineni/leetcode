class Solution {
    public int majorityElement(int[] nums) {
      
             int ele=Integer.MIN_VALUE;

        int count=0;

        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                count++;
                ele=nums[i];
            }

            else if(ele==nums[i])
            {
                count++;
            }
            else{
                count--;
            }

        }



        int count1=0;
        for(int i:nums)
        {
            if(i==ele)
            {
                count1++;
            }
        }

        if(count1>n/2)
        {
            return ele;

        }

        return -1;
    }
}