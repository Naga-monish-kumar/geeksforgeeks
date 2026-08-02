class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
         int ma=target-nums[i];
         if(map.containsKey(ma)){
            return new int[] {map.get(ma),i};
        }
           map.put(nums[i],i);
        }
        return new int[]{};
    }
}