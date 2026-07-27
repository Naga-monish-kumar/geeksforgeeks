class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int h=nums[nums.length-2]-1;
        int n=nums[nums.length-1]-1;
        int sum=h*n;
        return (sum);
    }
}