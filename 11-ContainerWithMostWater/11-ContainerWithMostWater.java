class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1;
        int maxWater = 0;
        while(i<j){
            int min = Math.min(heights[i], heights[j]);
            int water = (j-i)*min;
            maxWater = Math.max(water, maxWater);
            if(min == heights[i])
                i++;
            else if(min == heights[j])
                j--;
        }
        return maxWater;
    }
}