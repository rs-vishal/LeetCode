class Solution {
        public int maxRotateFunction(int[] nums) {

        int n = nums.length;
        int sum = 0, F = 0;
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }
        
        int max = F;
        
        for (int i = 1; i < n; i++) {
            F = F + sum - n * nums[n - i];
            max = Math.max(max, F);
        }
        
        return max;
    }
}