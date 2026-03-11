class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()) return false;
      char a[]=s.toCharArray();
      char b[]=t.toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);
      return Arrays.equals(a,b);
        }
}
//https://neetcode.io/problems/is-anagram/history?list=allNC&submissionIndex=0
