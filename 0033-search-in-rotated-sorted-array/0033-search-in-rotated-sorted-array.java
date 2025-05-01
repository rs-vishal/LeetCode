class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        
        int result=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                
                result=i;
            }
        }
        
        return result;
    }
}