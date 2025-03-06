class Solution {
    public int minDistance(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int[] dp1 = new int[word2.length()+1];
        int[] dp2 = new int[word2.length()+1];
        
        for (int i = 0; i < dp1.length; i++) {
            dp1[i] = i;
        }
        
        for (int i = 1; i <= word1.length(); i++) {
            dp2[0] = i;
            for (int j = 1; j <= word2.length(); j++) {
                if (ch1[i-1] == ch2[j-1]) {
                    dp2[j] = dp1[j-1];
                } else {
                    dp2[j] = 1 + Math.min(dp2[j-1], Math.min(dp1[j], dp1[j-1]));
                }
            }
            dp1 = dp2;
            dp2 = new int[word2.length() + 1];
        }
        return dp1[dp1.length - 1];
    }
}