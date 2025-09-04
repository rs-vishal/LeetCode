class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int maxfreq =0;
        int result = -1;

        for(int num : nums){
            if(num%2 ==0){
                map.put(num,map.getOrDefault(num,0)+1);
                int freq = map.get(num);
            
            if(freq > maxfreq || (freq == maxfreq && num < result)){
                maxfreq = freq;
                result = num;
            }
            }
        }
        return result;
    }
}