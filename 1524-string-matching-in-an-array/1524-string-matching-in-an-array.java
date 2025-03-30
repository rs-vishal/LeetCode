class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> map = new HashSet<>();
        int n = words.length;        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && words[j].contains(words[i])){
                    map.add(words[i]);
                }
            }
        }
        return new ArrayList<>(map);
    }
}