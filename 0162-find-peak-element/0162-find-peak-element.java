class Solution {
    public int findPeakElement(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // int index =0;
        // for(int i=0;i<nums.length;i++){
        //     if(max<nums[i]){
        //         max= nums[i];
        //         index =i;
        //     }
        // }
        // return index;
        int left=0,right = nums.length-1;
        while(left<right){
            int mid = left + (right - left) / 2;
            if(nums[mid]>nums[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}