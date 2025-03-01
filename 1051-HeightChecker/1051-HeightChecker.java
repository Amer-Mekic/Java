class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] cpy = new int[heights.length];
        for(int i = 0; i<heights.length;i++)
            cpy[i]=heights[i];
        Arrays.sort(heights);
        for(int i = 0; i<heights.length;i++){
            if(heights[i]!=cpy[i])
                count++;
        }
        return count;
    }
}