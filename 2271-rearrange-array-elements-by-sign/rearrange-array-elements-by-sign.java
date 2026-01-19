class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int positive=0;
        int negative=1;
        int[] newarr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                newarr[positive]=nums[i];
                positive+=2;
            }
            else{
                newarr[negative]=nums[i];
                negative+=2;
            }
        }
        return newarr;
    }
}