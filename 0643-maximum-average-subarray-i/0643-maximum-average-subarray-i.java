class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<k ;i++){
            sum+=nums[i];
        } 
        int window = sum; 
        for(int i=k;i<n;i++){
            sum +=nums[i];
            sum -= nums[i-k];
            window= Math.max(sum,window);
        }
        return (double)window/k;
    }
}