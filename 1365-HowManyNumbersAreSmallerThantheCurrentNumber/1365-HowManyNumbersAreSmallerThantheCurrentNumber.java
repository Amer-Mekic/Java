class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int[] orig = nums.clone();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
            map.putIfAbsent(nums[i], i);
        for(int i = 0; i < orig.length; i++){
            arr[i] = map.get(orig[i]);
        }
        return arr;
    }
}