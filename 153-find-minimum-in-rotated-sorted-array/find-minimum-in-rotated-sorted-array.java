class Solution {
    public int findMin(int[] nums) {
       int min = Integer.MAX_VALUE;

int low = 0;
int high = nums.length - 1;

while (low <= high) {
    int mid = (low + high) / 2;

    if (nums[low] <= nums[high]) {
        min = Math.min(nums[low], min);
        break;
    }
    // left side is sorted
    if (nums[low] <= nums[mid]) {
        min = Math.min(nums[low], min);
        low = mid + 1;
    }
    // right side is sorted
    else {
        min = Math.min(nums[mid], min);
        high = mid - 1;
    }
}

return min;



    }
}