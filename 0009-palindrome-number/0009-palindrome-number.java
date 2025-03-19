class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int w=x;
        while(x>0){
            int r=x%10;
            n=n*10+r;
            x=x/10;
        }
        return n==w;
    }
}