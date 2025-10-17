class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // int n = g.length;
        // int m  =  s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int op=0;
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(g[i] <= s[j]){
                op++;
                i++;
            }
            j++;
        }
        return op;
    }
}