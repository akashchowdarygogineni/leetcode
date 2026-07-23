class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        
    
        
       return recursivebs(nums,low,high,target);
    }

    public static int recursivebs(int[] nums,int low,int high,int target)
    {
        //base condition
        if(low>high)
        {
            return -1;
        }

        int mid=(low+high)/2;

        if(nums[mid]==target)
        {
            return mid;
        }

        else if(nums[mid]<target)
        {
            return recursivebs(nums,mid+1,high,target);
        }
        return recursivebs(nums,low,mid-1,target);
    }
}