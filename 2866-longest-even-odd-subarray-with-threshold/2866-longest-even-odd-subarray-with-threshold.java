class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int result =0;

        for(int i=0;i<n;i++){
            if(nums[i] %2 !=0 ||nums[i] > threshold) continue;

            int len =1;
            for(int j=i+1;j<n;j++){
                if(nums[j] > threshold) break;
                if((nums[j]%2) == (nums[j-1])%2) break;
                len++;
            }
            result = Math.max(result,len);
        }
        return result;
    }
}