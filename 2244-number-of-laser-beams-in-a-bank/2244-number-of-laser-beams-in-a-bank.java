class Solution {
    public int numberOfBeams(String[] bank) {
        long prev = bank[0].chars().filter(ch -> ch =='1').count();
        long res = 0;
        for(int i=1;i<bank.length;i++){
            long cur = bank[i].chars().filter(ch -> ch =='1').count();
            // long cur =
            if(cur>0){
                res += (cur*prev);
                prev = cur;
            } 
        }
        return (int)res;
    }
}