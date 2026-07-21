class Solution {
    public int maxProduct(int[] nums) {
        


        int prefixp=1;
        int suffixp=1;
        int maxp=Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++)
        {
            if(prefixp==0)
            {
                prefixp=1;
            }
            if(suffixp==0)
            {
                suffixp=1;
            }
            prefixp=prefixp*nums[i];
            suffixp=suffixp*nums[nums.length-i-1];
            maxp=Math.max(maxp,Math.max(prefixp,suffixp));
        }

        return maxp;
    }
}