class Solution {
    public int[] searchRange(int[] nums, int target) {
        int flag = 0;
        int[] result = new int[2];  
        
        result[0] = -1;
        result[1] = -1;
        
        for (int i = 0; i <  nums.length; i++) {
            if (target == nums[i] && flag == 0) {
                result[0] = i;
                flag = 1;
            }
            if (target == nums[i]) {
                result[1] = i;
            }
        }
        
        return result;
    }
}