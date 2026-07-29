class Solution {
    public String addStrings(String num1, String num2) {
       int n=num1.length()-1;
       int n1=num2.length()-1;
       int carry=0;
        
        StringBuilder sb=new StringBuilder();
        while(n>=0 || n1>=0 || carry!=0){
            int sum=carry;
         if(n>=0){
            sum+=num1.charAt(n)-'0';
            n--;
         }
         if(n1>=0){
            sum+=num2.charAt(n1)-'0';
            n1--;
         }
         sb.append(sum%10);
         carry=sum/10;

        }
        return sb.reverse().toString();
    }
}