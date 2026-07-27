class Solution {
    public int firstMatchingIndex(String s) {
        int count=0;
        int end=s.length()-1;
        int start=0;
       while(start<=end){
             if(s.charAt(start)==s.charAt(end)){
              //  count++;
                return start;
             }
             start++;
             end--;
        }
        return -1;
    }
}