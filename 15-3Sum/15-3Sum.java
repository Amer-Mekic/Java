// Last updated: 04. 05. 2025. 20:35:08
import java.math.BigInteger;
class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if(s.length()==0)
            return 0;
        if(s.charAt(0)=='+')
            i=1;
        else if(s.charAt(0)=='-'){
            sb.append('-');
            i=1;
        }
        while(i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
            sb.append(s.charAt(i)-'0');
            i++;
        }
        String num = sb.toString();
        if (num.length()==0 || (num.length()==1 && num.charAt(0)=='-'))
            return 0;
        int result = 0;
        try {
            result = Integer.parseInt(num);
        } catch (Exception e) {
            BigInteger numb=new BigInteger(num);;
            if(numb.compareTo(new BigInteger(""+Integer.MAX_VALUE))==1)
                return Integer.MAX_VALUE;
            if(numb.compareTo(new BigInteger(""+Integer.MIN_VALUE))==-1)
                return Integer.MIN_VALUE;
            // We're here iff s represents a valid integer that's outside
            // of java.lang.Integer range. Consider using custom exception type.
        }
        // the input parsed no problem
        return result;
    }
}