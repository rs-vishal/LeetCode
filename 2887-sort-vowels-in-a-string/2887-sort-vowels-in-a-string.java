class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c) !=-1){
                vowels.add(c);
            }
        }
        Collections.sort(vowels);
        int v =0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if("AEIOUaeiou".indexOf(c) !=-1){
                sb.append(vowels.get(v++));
            }
            else{
                sb.append(c);
            }

        }
        return sb.toString();
    }
}