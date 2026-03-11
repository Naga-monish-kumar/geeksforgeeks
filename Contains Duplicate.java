class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        for(int i:nums){
            if(seen.contains(i)) return true;
            seen.add(i);
        }
        return false;
    }
}
//https://neetcode.io/problems/duplicate-integer/history?list=allNC&submissionIndex=0
