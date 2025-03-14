class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : magazine.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(char c : ransomNote.toCharArray()){
            if(!map.containsKey(c))
                return false;
            if(map.containsKey(c)){
                if(map.get(c)>1){
                    map.replace(c, map.get(c), map.get(c)-1);
                }
                else
                    map.remove(c);
            }
        }
        return true;
    }
}