class Solution {
    static int count=0;
    public int reversePairs(int[] nums) {
        count=0;
       mergesort(0,nums.length-1,nums);
       return count;

    }
       public static void reversepairscount(int low,int mid,int high,int[] nums)
    {
        int left=low;
        int right=mid+1;

        while(left<=mid)
        {
            while(right<=high && (long)nums[left]>(long)2*nums[right])
            {
                right++;
            }
            count+=right-(mid+1);
            left++;
        }
    }

     public static void merge(int low,int mid,int high,int[] nums)
    {
        ArrayList<Integer> li=new ArrayList<>();
       int left=low;
       int right=mid+1;

        while(left<=mid && right<=high )
        {
            if(nums[left]<=nums[right])
            {
                li.add(nums[left]);
                left++;
            }
            else{
                li.add(nums[right]);
                right++;
            }
        }
        while(left<=mid)
        {
            li.add(nums[left]);
            left++;
        }
         while(right<=high)
        {
            li.add(nums[right]);
            right++;
        }

        for(int i=0;i<li.size();i++)
        {
            nums[low+i]=li.get(i);
        }
    }

    public static void mergesort(int low,int high,int[] nums)
    {
        if(low>=high)
        {
            return;
        }

        int mid=(low+high)/2;

        mergesort(low,mid,nums);
        mergesort(mid+1,high,nums);
        reversepairscount(low,mid,high,nums);
        merge(low,mid,high,nums);
    }
}