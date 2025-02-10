class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i<=s.length();i++){
            for(int j = s.length(); j>i;j--){
                StringBuilder rev = new StringBuilder(s.substring(i,j));
                StringBuilder orig = new StringBuilder(s.substring(i,j));
                if(orig.toString().equals(rev.reverse().toString()) && !orig.toString().equals("")){
                        count++;
                }
            }
        }
        return count;
    }
}