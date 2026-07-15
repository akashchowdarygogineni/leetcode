class Solution {
    public int numSubarraysWithSum(int[] arr, int target) {
        
         HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
	
        int count=0;
        map.put(0,1);

	    for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
          
           if(map.containsKey(sum-target))
           {
               count+=map.get(sum-target);
           }


           if(!map.containsKey(sum))
           {
            map.put(sum,1);
           }
           else if(map.containsKey(sum)){
              map.put(sum,map.get(sum)+1);
           }
        }


        return count;
    }
}