class Solution {
    public int majorityElement(int[] nums) {
        int max = -1;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(count==0){
                max = nums[i];
                count++;
            }
            else{
                if(nums[i]==max)
                    count++;
                else
                    count--;
            }
        }
        return max;
    }
}