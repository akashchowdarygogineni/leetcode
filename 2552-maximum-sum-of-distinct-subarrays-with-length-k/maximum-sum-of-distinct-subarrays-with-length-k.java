class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int left=0;
       int right=k-1;

       long sum=0;
       long maxsum=0;

       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<=right;i++)
       {
        sum+=arr[i];

        if(!map.containsKey(arr[i]))
        {
            map.put(arr[i],1);
        }
        else{
            map.put(arr[i],map.get(arr[i])+1);
        }
       }

       if(map.size()==k)
       {
         maxsum=sum;
       }


       while(right<arr.length-1)
       {
        
         map.put(arr[left],map.get(arr[left])-1);
         if(map.get(arr[left])==0)
         {
            map.remove(arr[left]);
         }
         sum=sum-arr[left];
         left++;
         right++;
         sum+=arr[right];

         if(!map.containsKey(arr[right]))
         {
            map.put(arr[right],1);
         }
         else{
            map.put(arr[right],map.get(arr[right])+1);
         }

         if(map.size()==k)
         {
            if(sum>maxsum)
            {
            maxsum=sum;
           }
         }
          
       }

       return maxsum;
    }
}