class Solution {
    public long[] sumOfThree(long nums) {
        if(nums % 3 !=0 ) return new long[0];
        long x = nums/3;
        return new long[]{x-1,x,x+1};
    }
}