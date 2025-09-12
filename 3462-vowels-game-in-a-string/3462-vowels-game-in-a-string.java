class Solution {
    public boolean doesAliceWin(String s) {
        int n = countvowels(s);
        if(n == 0) return false;
        return n>0;
    }
    public int countvowels(String s){
        int vowelcount = 0;
        String ss = s.toLowerCase();
        for (char ch : ss.toCharArray()) {
        if ("aeiou".indexOf(ch) != -1) {
            vowelcount++;
        }
    }
        return vowelcount;
    }
}