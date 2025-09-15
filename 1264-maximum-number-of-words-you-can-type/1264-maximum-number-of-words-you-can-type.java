class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int res = 0;
        String[] words = text.split(" ");
        
        for (String word : words) {
            boolean canType = true;
            for (char c : brokenLetters.toCharArray()) {
                if (word.indexOf(c) != -1) { 
                    canType = false;
                    break;
                }
            }
            if (canType) res++;
        }
        
        return res;
    }
}
