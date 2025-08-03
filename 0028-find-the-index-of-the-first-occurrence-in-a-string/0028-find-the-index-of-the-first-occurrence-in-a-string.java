class Solution {
    public int strStr(String haystack, String needle) {
        int nn = needle.length();
        int hn = haystack.length();
        
        if (nn == 0) return 0;

        for (int i = 0; i <= hn - nn; i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                int j = 0;
                int k = i;
                while (j < nn && k < hn && needle.charAt(j) == haystack.charAt(k)) {
                    j++;
                    k++;
                }
                if (j == nn) {
                    return i;
                }
            }
        }
        return -1;
    }
}
