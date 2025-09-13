class Solution {
    public int maxFreqSum(String s) {
        int vowmax = 0;
        int consmax =0;
        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch =='e' || ch=='o'|| ch=='i' || ch =='u'){
                vow.put(ch,vow.getOrDefault(ch,0)+1);
                vowmax = Math.max(vowmax,vow.get(ch));
            }
            else{
                cons.put(ch,cons.getOrDefault(ch,0)+1);
                consmax = Math.max(consmax,cons.get(ch));
            }
        }
        return vowmax+consmax;
    }
}