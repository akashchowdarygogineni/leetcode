class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        

        HashMap<Integer,Integer> map=new HashMap<>();
        
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int r=sum%k;

            if(r<0)
            {
                r=r+k;
            }

            if(map.containsKey(r))
            {
                if(i-map.get(r)>=2)
                {
                   return true;
                }
            }   

            if(!map.containsKey(r))
            {
                map.put(r,i);
            }
           
        }
        return false;
    }
}