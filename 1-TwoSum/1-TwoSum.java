class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0; i<nums.length;i++){
            hm.putIfAbsent(nums[i], i);
            if(hm.containsKey(target-nums[i]) && hm.get(target-nums[i])!=i){
                return new int[] {i, hm.get(target-nums[i])};
            }
        }
        return new int[]{};
    }
}
