class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ev=(nums.length/2)+1;
        int od=nums.length/2;
        int eve[]=new int[ev];
        int odd[]=new int[od];
        int n=0;
        int h=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                  eve[n++]=nums[i];
            }else{
                odd[h++]=nums[i];
            }
        }
        int l=0;
        int m=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
              nums[i]=eve[l];
              l++;
            }else{
                nums[i]=odd[m];
                m++;
            }
        }
        return nums;
    }
}