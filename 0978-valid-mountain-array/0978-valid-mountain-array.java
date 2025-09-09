class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n <3) return false;
        int i=0;
        while(i<n-1){
            if(arr[i] < arr[i+1]){
                i++;
            }else{
                break;
            }
        }
        if(i == n-1 || i== 0 ) return false;
        while(i<n-1){
            if(arr[i] > arr[i+1]){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}