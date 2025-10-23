class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        HashMap<Character,Integer> count = new HashMap<>();

        for(char c : s.toCharArray()) count.put(c,count.getOrDefault(c,0)+1);
        for (char c : count.keySet()) {
            if (count.get(c) < k) {
                int maxLen = 0;
                
                for (String sub : s.split(String.valueOf(c))) {
                    maxLen = Math.max(maxLen, longestSubstring(sub, k));
                }
                
                return maxLen;
            }
        }
        return n;

    }
}