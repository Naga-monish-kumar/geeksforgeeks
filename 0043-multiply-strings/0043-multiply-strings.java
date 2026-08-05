import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
       BigInteger n=new BigInteger(num1);
       BigInteger h=new BigInteger(num2);

       return (n).multiply(h).toString(); 
    }
}