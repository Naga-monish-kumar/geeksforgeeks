class Solution {
    public boolean isPalindrome(int x) {
 int n=x;
   if(x<0){
    return false;
   }
   int sum=0;
   while(x!=0){
    int mod=x%10;
    sum=sum*10+mod;
    x=x/10;
    
   }
   return sum==n;
    }
}