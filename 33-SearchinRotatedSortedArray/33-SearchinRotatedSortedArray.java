class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int med = l + (r - l) / 2;
            if (nums[med] == target) {
                return med;
            }
            if (nums[l] <= nums[med]) {
                if (nums[l] <= target && target < nums[med]) {
                    r = med - 1;
                } else {
                    l = med + 1;
                }
            } else { 
                if (nums[med] < target && target <= nums[r]) {
                    l = med + 1;
                } else {
                    r = med - 1; 
                }
            }
        }
        return -1;
    }
}