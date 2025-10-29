class Solution {
    public int climbStairs(int n) {
        if(n==1)
        {
            return 1;            
        }
        if(n==2)
        {
            return 2;
        }
        int []dw=new int [n+1];
        dw[1]=1;
        dw[2]=2;
        for(int i=3;i<=n;i++)
        {
            dw[i]=dw[i-1]+dw[i-2];
        }
        return dw[n];
    }
}