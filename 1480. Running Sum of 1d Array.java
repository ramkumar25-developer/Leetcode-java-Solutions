class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if(len <= 1){
            return nums;
        }
        else{
            for(int i=1;i<len;i++){
                nums[i] = nums[i]+nums[i-1];
            }
        }
        return nums;
    }
}
