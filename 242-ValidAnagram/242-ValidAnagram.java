class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }
        HashMap<Character, Integer> tt = new HashMap<>();
        for(char c : t.toCharArray()){
            if (tt.containsKey(c)) {
                tt.put(c, tt.get(c) + 1);
            } else {
                tt.put(c, 1);
            }
        }
        return charCountMap.equals(tt);
    }
}