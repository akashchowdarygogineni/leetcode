class Solution {
    public int countKDifference(int[] arr, int k) {
        
        int count=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        
     
        
        for(int i=0;i<arr.length;i++)
        {
          
            if(map.containsKey(arr[i]-k))
            {
                count+=map.get(arr[i]-k);
            }
            
            if(map.containsKey(arr[i]+k))
            {
                count+=map.get(arr[i]+k);
            }
          
            
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        return count;
    }
}