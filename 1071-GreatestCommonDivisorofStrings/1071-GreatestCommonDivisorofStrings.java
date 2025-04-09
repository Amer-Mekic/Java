// Last updated: 10. 04. 2025. 00:00:51
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(i<=word1.length()-1 && j<=word2.length()-1){
            sb.append(word1.charAt(i));
            i++;
            sb.append(word2.charAt(j));
            j++;
        }
        while(i<=word1.length()-1){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<=word2.length()-1){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}