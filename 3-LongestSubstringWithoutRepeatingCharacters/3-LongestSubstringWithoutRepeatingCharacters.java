class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int l = 0, r=0;
        while(r<s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            r++;
            max = (max>(r-l))?max:(r-l);
        }
        return max;
    }
}