class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = 0;
        for (int num : set) { // Loop through set directly
            if (!set.contains(num - 1)) { // Start of a new sequence
                int currNum = num;
                int len = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    len++;
                }

                res = Math.max(res, len);
            }
        }
        return res;
    }
}