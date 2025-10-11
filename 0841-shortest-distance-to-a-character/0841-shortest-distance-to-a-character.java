class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int p1 = -n;
        int res [] = new int[n];
        for(int i=0;i<n;i++){
            if(s.charAt(i) == c) p1= i;
            res[i] = i-p1;
        }
        for(int i=p1-1;i>=0;--i){
            if(s.charAt(i) == c) p1=i;
            res[i] = Math.min(res[i],p1-i);
        }
        return res;
    }
}