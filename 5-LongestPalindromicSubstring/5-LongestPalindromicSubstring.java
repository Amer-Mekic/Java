class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)
            return s;
        int max=0;
        int currMax=0;
        int maxL = 0;
        int maxR = 0;
        for(int i = 0; i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
               if(isPalindrome(s.substring(i,j))){
                    currMax = j-i;
                    if(currMax>max){
                        maxL=i;
                        maxR=j;
                        max=currMax;
                    }
                } 
            }
        }
        return s.substring(maxL,maxR);
    }
    public boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }
            else
                return false;
        }
        return true;
    }  
}