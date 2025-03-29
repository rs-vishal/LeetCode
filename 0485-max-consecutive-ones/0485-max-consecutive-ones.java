class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=0,max=0;
        for(int i : nums){
            if(i==1){
                n++;
                max = Math.max(max,n);

            }
            else{
                n=0;    
            }   
        }
        return max;
    }
}