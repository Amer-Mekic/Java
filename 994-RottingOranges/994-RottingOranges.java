// Last updated: 03. 05. 2025. 21:22:38
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> m = new HashMap<>();
        int odd = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0)+1);
            if((m.get(c) & 1)==1)
                odd++;
            else
                odd--;
        }
        if(odd>1)
            return s.length()-odd+1;
        return s.length();
    }
}