class Solution {
    public boolean isBalanced(String num) {
        int n = num.length();
        int even =0;
        int odd =0;
        for(int i=0;i<n;i=i+2){
            even+=num.charAt(i)-'0';
        }
        for(int j=1;j<n;j=j+2){
            odd+=num.charAt(j)-'0';
        }
        
        return odd==even;
    }
}