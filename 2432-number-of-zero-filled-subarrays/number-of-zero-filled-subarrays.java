class Solution {
    public long zeroFilledSubarray(int[] arr) {
       long streak=0;
       long ans=0;

       for(int i:arr)
       {
         if(i==0)
         {
            streak++;
            ans+=streak;
         }
         else{
            streak=0;
         }
       }

       return ans;
    }
}