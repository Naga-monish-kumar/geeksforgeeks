class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=Math.abs(nums[i]-nums[j]);
                if(k==sum){
                    count++;
                }
            }
        }
        return count;
    }
}