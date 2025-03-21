class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> result = new HashMap<>();
            for(String s : strs){
                char [] ch = s.toCharArray();
                Arrays.sort(ch);
                String key = new String(ch);
                if(!result.containsKey(key)){
                    result.put(key,new ArrayList<>());
                }
                result.get(key).add(s);
            }        
            return new ArrayList<>(result.values());
    }
}