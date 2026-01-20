class Solution {
    public int majorityElement(int[] nums) {
        // int ele=Integer.MIN_VALUE;
        // int count=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //    if(count==0)
        //    {
        //      ele=nums[i];
        //      count++;
        //    }
        //    else if(nums[i]==ele)
        //    {
        //      count++;

        //    }
        //    else{
        //     count--;
        //    }
        // }
         
        // int count1=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==ele)
        //     {
        //        count1++;
        //     }
           
        // }

        // if(count1>nums.length/2)
        // {
        //     return ele;
        // }
        // return -1;



        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        Set<Integer> s=map.keySet();

        for(int i:s)
        {
            if(map.get(i)>n/2)
            {
                return i;
            }
        }
        return -1;
    }
}