class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] str = paragraph.toLowerCase().split("[!?',;.\\s]+");
        Map<String,Integer> map = new HashMap<>();
        Set<String> b = new HashSet<>();
        for(String s : banned)
            b.add(s);
        for(String s : str){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        String word = "";
        for(String key : map.keySet()){
            if(map.get(key)>max && !b.contains(key)){
                max=map.get(key);
                word = key;
            }
        }
        return word;
    }
}