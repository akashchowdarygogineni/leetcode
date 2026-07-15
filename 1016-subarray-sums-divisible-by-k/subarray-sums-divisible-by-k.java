class Solution {
    public int subarraysDivByK(int[] arr, int k) {
         int count=0;
        
        
        int sum=0;
        
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
        
        map.put(0,1);
        
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            
            int rem=sum%k;
            
            if(rem<0)
            {
                rem=rem+k;
            }
            
            if(map.containsKey(rem))
            {
                count+=map.get(rem);
            }
            
            
            if(!map.containsKey(rem))
            {
                map.put(rem,1);
            }
            else{
                map.put(rem,map.get(rem)+1);
            }
        }
        
        return count;
    }
}