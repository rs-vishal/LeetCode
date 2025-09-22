class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> set = new HashMap<>();
        int max = 0;
        int sum =0;
        for(int num : nums){
            int cur = set.getOrDefault(num,0)+1;
            set.put(num,cur);
            max = Math.max(cur,max);
        }
        for(int n : set.keySet()){
            int freq = set.get(n);
            if(freq == max) sum+=freq;
        }
        return sum;
    }
}