// Last updated: 08. 04. 2025. 15:40:42
class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        if(n==0)
            return true;
        for(int i = 0; i < f.length; i++){
            if(f[i]==0 && (i==0 || f[i-1]==0) && (i==f.length-1 || f[i+1]==0)){
                n--;
                f[i]=1;
                if(n==0)
                    return true;
            }
        }
        return false;
    }
}