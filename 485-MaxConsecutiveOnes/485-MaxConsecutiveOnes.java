class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int currMax = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]==1)
                currMax++;
            else
                currMax =  0;
            max = (currMax>max)?currMax:max;
        }
        return max;
    }
}