class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] frequency = new ArrayList[nums.length + 1];
        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }

        for (int num : map.keySet()) {
            int freq = map.get(num);
            frequency[freq].add(num);
        }

        int[] res = new int[k];
        int j = 0;
        for (int i = frequency.length - 1; i >= 0 && j < k; i--) {
            for (int num : frequency[i]) {
                res[j++] = num;
                if (j == k) break;
            }
        }
        
        return res;
    }
}
