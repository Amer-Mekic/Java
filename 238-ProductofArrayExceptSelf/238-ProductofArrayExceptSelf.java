class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            res[i] = j;
            j*=nums[i];
        }
        int t = 1;
        for(int i = nums.length-1; i >= 0; i--){
            res[i] *= t;
            t*=nums[i];
        }
        return res;
    }
}