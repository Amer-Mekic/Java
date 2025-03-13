class Solution {
    public boolean isSubsequence(String s, String t) {
        int ind = -1;
        int i = 0;
        int j = 0;
        while(i<t.length() && j<s.length()){
            if(t.charAt(i)==s.charAt(j) && i>ind){
                ind = i;
                i++;
                j++;
            }
            else if(t.charAt(i)!=s.charAt(j)){
                i++;
            }
            else
                return false;
        }
        if(j<s.length())
            return false;
        return true;
    }
}