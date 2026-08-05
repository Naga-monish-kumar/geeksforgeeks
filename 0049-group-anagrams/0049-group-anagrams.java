class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String i:strs){
            char word[]=i.toCharArray();
            Arrays.sort(word);
            String str=new String(word);
            map.putIfAbsent(str,new ArrayList<>());
            map.get(str).add(i);
        }
        return new ArrayList<>(map.values());
      
    }
}