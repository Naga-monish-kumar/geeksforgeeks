class Solution {
    public int scoreOfString(String s) {
    char []h=s.toCharArray();
    int ans=0;
      for(int i=0;i<h.length-1;i++){
        ans=Math.abs(h[i+1]-h[i])+ans;
      } 
      return ans; 
    }
}
//https://neetcode.io/problems/score-of-a-string/question
