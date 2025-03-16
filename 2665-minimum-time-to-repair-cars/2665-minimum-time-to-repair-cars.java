class Solution {
    private boolean helper(int []rank,int cars,long mid){
        long car = 0;
        for(int r :rank){
            car +=Math.sqrt(mid/r);
        }
        return car>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long result =0;
        long  left=1,right =(long)Math.pow(10,14);
        while(left<=right){
            long mid = left+(right-left)/2;
            if(helper(ranks,cars,mid)){
                right = mid -1;
                result = mid;
            }
            else{
                left = mid +1;                
            }
        }
        return result;
    }
}