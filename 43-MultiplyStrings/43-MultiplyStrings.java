import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        BigInteger nr1 = BigInteger.ZERO;
        BigInteger place = BigInteger.ONE;
        for (int i = n1.length - 1; i >= 0; i--) {
            nr1 = nr1.add(place.multiply(BigInteger.valueOf(n1[i] - '0')));
            place = place.multiply(BigInteger.TEN);
        }
        BigInteger nr2 = BigInteger.ZERO;
        place = BigInteger.ONE;
        for (int i = n2.length - 1; i >= 0; i--) {
            nr2 = nr2.add(place.multiply(BigInteger.valueOf(n2[i] - '0')));
            place = place.multiply(BigInteger.TEN);
        }
        BigInteger prod = nr1.multiply(nr2);
        return prod.toString();
    }
}