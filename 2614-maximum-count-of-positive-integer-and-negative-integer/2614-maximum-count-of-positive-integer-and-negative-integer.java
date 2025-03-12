class Solution {
    public int maximumCount(int[] nums) {
        int pcount =0,ncount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >0){
                pcount++;
            }
            else if(nums[i]<0){
                ncount++;
            }
        }
        if(ncount>pcount){
            
            return ncount;
        }
        else{
            return pcount;
        }
    }
}