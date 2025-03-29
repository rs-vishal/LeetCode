class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> unique = new HashMap<Integer,Integer>();
        for(int i:arr){
            unique.put(i,unique.getOrDefault(i,0)+1);
        }
        HashSet<Integer> occurence = new HashSet<>(unique.values());
        return unique.size() == occurence.size();
    }
}