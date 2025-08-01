class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=0;i<len/2;i++){
            arr[j++] = nums[i];
            arr[j++] = nums[len/2+i];
        }
        return arr;
    }
}
