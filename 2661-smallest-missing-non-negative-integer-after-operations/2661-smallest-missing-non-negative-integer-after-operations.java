class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        int feq[] = new int[value];
        for(int num : nums){
            int r = num %value;
            if(r<0) r+=value;
            feq[r]++;
        }
        for(int k=0 ; ; k++){
            int r= k%value;
            if(feq[r]-- == 0 ) return k;
        }
        
    }
}