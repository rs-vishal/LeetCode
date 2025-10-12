class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        int p1 = arr[0];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                if(arr[i] == (2*arr[j])) return true;
                }
            }
        }
        return false;
    }
}