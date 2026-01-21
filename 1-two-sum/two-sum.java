class Solution {
    public int[] twoSum(int[] nums, int target) {
     
       HashMap<Integer,Integer> map=new HashMap<>();
        int[] newarr=new int[2];
        newarr[0]=newarr[1]=-1;
        for(int i=0;i<nums.length;i++)
        {
            
            
            int sum=target-nums[i];
            
            if(map.containsKey(sum))
            {
                newarr[0]=map.get(sum);
                newarr[1]=i;
                return newarr;
                
            }
            
            map.put(nums[i],i);
        }
        return newarr; 
    }
}