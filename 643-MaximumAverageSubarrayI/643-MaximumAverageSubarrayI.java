class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)
            return (double) nums[0];
        double maxAvg = Integer.MIN_VALUE;
        int i = 0;
        while(i+k-1<nums.length){
            int sum = 0;
            int count=0;
            double currAvg = Integer.MIN_VALUE;
            for(int j = i; j<i+k;j++){
                count++;
                sum+=nums[j];
            }
            currAvg=(double)sum/k;
            maxAvg=(currAvg>maxAvg)?currAvg:maxAvg;
            if(count==nums.length)
                break;
            i++;
        }
        return maxAvg;
    }
}