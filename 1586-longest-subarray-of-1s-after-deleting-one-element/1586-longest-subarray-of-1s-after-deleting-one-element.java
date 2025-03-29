class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int cur =0 ,pre=0,ans =0;
        for(int i : nums){
            if(i==1){
                cur++;
            }
            else{
                ans = Math.max(ans,pre+cur);
                pre = cur;
                cur =0;
            }
        }
        ans = Math.max(ans,pre+cur);

        return ans==n ?ans-1:ans;
    }
}