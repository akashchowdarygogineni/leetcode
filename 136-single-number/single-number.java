class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length==0)
        {
            return -1;
        }

        HashMap<Integer,Integer> map=new HashMap<>();


        //then traverse over the given array

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
            if(map.get(i)==1)
            {
                return i;
            }
        }

        return -1;
    }
}