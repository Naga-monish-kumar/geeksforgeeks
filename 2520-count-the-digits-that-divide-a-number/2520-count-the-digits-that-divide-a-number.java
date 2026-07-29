class Solution {
    public int countDigits(int num) {
        int nums=num;
      int count=0;
      while(num!=0){
        int tem=num%10;
        if(nums%tem==0){
            count++;
        }
           num/=10;
      }  
      return count;
    }
}