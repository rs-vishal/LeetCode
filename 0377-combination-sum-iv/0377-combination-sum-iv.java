class Solution {
    public int combinationSum4(int[] nums, int target) {
        int []re = new int[target+1];
        re[0] = 1;
        for(int i=1;i<target+1;i++){
            for(int num : nums){
                if( i-num>=0){
                    re[i]+=re[i-num];
                }
            }
        }
        return re[target];
    }
}