class Solution {
    public int firstUniqChar(String s) {
        char[] sa = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (char c : sa) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 0; i < sa.length; i++) {
            if (map.get(sa[i]) == 1) {
                return i;
            }
        }
        
        return -1;
    }
}
