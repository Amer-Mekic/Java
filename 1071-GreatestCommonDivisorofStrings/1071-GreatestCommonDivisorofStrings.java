// Last updated: 10. 04. 2025. 00:13:40
class Solution {
    public String reverseWords(String str) {
        String[] s = str.trim().split("\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = s.length-1; i>= 1; i--){
            sb.append(s[i]+" ");
        }
        sb.append(s[0]);
        return sb.toString();
    }
}