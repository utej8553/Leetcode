import java.math.BigInteger;
class Solution {
    public int numSteps(String s) {
        int res = 0;
        BigInteger value = new BigInteger(s, 2);
        BigInteger two = BigInteger.valueOf(2);
        while (!value.equals(BigInteger.ONE)) {
            if (value.mod(two).equals(BigInteger.ZERO)) {
                value = value.divide(BigInteger.TWO);
            } else {
                value = value.add(BigInteger.ONE);
            }
            res++;
            System.out.println(value);
        }
        return res;

    }
}