class Solution {
    public int sumBase(int n, int k) {
        String base = Integer.toString(n ,k);
        int sum=0;
        for(char c : base.toCharArray()){
            sum+=(c-'0');
        }

        return sum;
    }
}