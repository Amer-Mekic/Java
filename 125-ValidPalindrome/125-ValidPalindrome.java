class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0)
            return true;
        StringBuilder sb = new StringBuilder();
        StringBuilder rev = new StringBuilder();
        for(char c : s.toLowerCase().toCharArray()){
            if((c>=97 && c<=122) || (c>=48 && c<=57))
                sb.append(c);
        }
        String ss = s.toLowerCase();
        for(int i = ss.length()-1; i>= 0; i--){
            if((ss.charAt(i)>=97 && ss.charAt(i)<=122) || (ss.charAt(i)>=48 && ss.charAt(i)<=57))
                rev.append(ss.charAt(i));
        }
        if(sb.toString().equals(rev.toString()))
            return true;
        return false; 
    }
}