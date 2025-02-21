class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 0;
        int lineSize=0;
        int lastLine = 0;
        for(int i =  0; i<s.length(); i++){
            while(lineSize<100 && i<s.length()){
                if(lineSize+widths[s.charAt(i)-'a']>100)
                    break;
                lineSize+=widths[s.charAt(i)-'a'];
                i++;
            }
            i--;
            lines++;
            lastLine = lineSize;
            lineSize=0;
        }
        return new int[]{lines, lastLine};
    }
}