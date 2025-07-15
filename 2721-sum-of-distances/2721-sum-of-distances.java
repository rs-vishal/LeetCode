import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] result = new long[n];
        
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        for (List<Integer> list : map.values()) {
            int size = list.size();
            long[] prefixSum = new long[size];
            prefixSum[0] = list.get(0);
            for (int i = 1; i < size; i++) {
                prefixSum[i] = prefixSum[i - 1] + list.get(i);
            }
            
            for (int i = 0; i < size; i++) {
                int idx = list.get(i);
                long left = (long)i * list.get(i) - (i > 0 ? prefixSum[i - 1] : 0);
                long right = (prefixSum[size - 1] - prefixSum[i]) - (long)(size - i - 1) * list.get(i);
                result[idx] = left + right;
            }
        }
        
        return result;
    }
}
