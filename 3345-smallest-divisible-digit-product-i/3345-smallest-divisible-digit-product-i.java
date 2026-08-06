class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int pro=1;
            int num=n;
            while(num>0) {
                pro*=(num%10);
                num/=10;
            }
            if(n==0) {
                pro=0;
            }
            if(pro%t==0) {
                return n;
            }
            n++;
        }
    }
}