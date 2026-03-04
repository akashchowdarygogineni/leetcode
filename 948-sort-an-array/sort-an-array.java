class Solution {
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
        merge(low,mid,high,nums);
    }
    public int[] sortArray(int[] nums) {
        if(nums.length<=1)
        {
            return nums;
        }
       mergesort(0,nums.length-1,nums);
       return nums;
        
    }
}