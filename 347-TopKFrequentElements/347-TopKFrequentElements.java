class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        int li = list.size()-1;
        int arI = 0;
        for(int key : map.keySet()){
            for(int i = li; i>=list.size()-k; i--){
                if(map.get(key)==list.get(i)){
                    arr[arI++]=key;
                    break;
                }
            }
        }
        return arr;
    }
}