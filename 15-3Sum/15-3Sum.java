// Last updated: 04. 05. 2025. 18:42:56
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]>0) // Can't get 0 if all positive after some i
                break;
            if(i>0 && nums[i-1]==nums[i]) // If 1st num is same as previous 1st
                continue;
            int curr = nums[i]; //curr 1st
            int l=i+1; //left ptr at num next to current first
            int r=nums.length-1;
            while(l<r){
                int threeSum = nums[l]+nums[r]+curr;
                if(threeSum == 0){ // if sum is 0 add this comb to result list
                    ls.add(Arrays.asList(curr, nums[l], nums[r]));
                    l++; // need to shift only one ptr to get other combs
                    while(nums[l]==nums[l-1] && l<r) // if we shifted to same int
                        l++;
                }
                else if(threeSum > 0){ // if curr 3sum too big, decrease it (decrement right ptr)
                    r--;
                }
                else{ // if too small increase it
                    l++;
                }
            }
        }
        return ls; 
    }
}