class Solution {
    public int getMaximumGenerated(int n) {
        int[] a = new int[n+1];
        if(n<1){
            return 0;
        }        
        a[0] = 0;
        a[1] = 1;
        int t = 1;
        for(int i=2;i<n+1;i++){
            if(i%2==0){
                a[t*2] = a[t];
            }
            else if(i%2!=0){
                a[(t*2)+1] = a[t] + a[t+1];
                t++;
            }
        }
        Arrays.sort(a);
        return a[n];
    }
}