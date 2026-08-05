class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String arr[]=new String[heights.length];
        int ind=0;
        int n[]=heights.clone();
    Arrays.sort(heights);
   // int ind=0;
    for(int i=heights.length-1;i>=0;i--){
        for(int j=0;j<heights.length;j++){
        if(heights[i]==n[j]){
           arr[ind++]=names[j];
        }
    }
    }
    return arr;
    }
}