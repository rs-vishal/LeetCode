class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        StringBuilder  res = new StringBuilder();
        for(int i=0;i<len;i++){
            int l = i;
            int r= i;
            while( l>=0 && r<len && s.charAt(l) == s.charAt(r)){
                if(r - l +1  > res.length()){
                res= new StringBuilder(s.substring(l,r+1));
                }
                l-=1;
                r+=1;
            }
            l=i;
            r=i+1;
            while( l>=0 && r<len && s.charAt(l) == s.charAt(r)){
                if(r - l +1  > res.length()){
                res= new StringBuilder(s.substring(l,r+1));
                }
                l-=1;
                r+=1;
            }
        }
        return res.toString();
    }
}