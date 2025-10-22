class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closesum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
            int csum  =  nums[i]+nums[left]+nums[right];
                
                if((Math.abs(closesum-target) > (Math.abs(csum-target)))){
                    closesum = csum;
                }
                if(csum < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return closesum;
    }
}