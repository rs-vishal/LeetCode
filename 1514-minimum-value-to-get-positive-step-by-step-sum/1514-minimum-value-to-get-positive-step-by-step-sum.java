class Solution {
    public int minStartValue(int[] nums) {
        int minSum = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum += nums[i];
            minSum = Math.min(sum,minSum);
        }
        return minSum > 0 ? 1: Math.abs(minSum-1);
    }
}