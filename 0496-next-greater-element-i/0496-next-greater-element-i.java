class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int ar [] = new int [n1];
        boolean isvisited []  = new boolean[n2];

        for(int i=0;i<n1;i++){
            ar[i] =-1;
            int j =0;
            while(j<n2){
                if(nums1[i] == nums2[j]){
                    break;
                }else{
                        j++;
                } 
            }
            for(int k=j;k<n2;k++){
                if(nums1[i] < nums2[k]){
                    ar[i] = nums2[k];
                    break;
                } 
            }
            System.out.println();
        }
        return ar;
    }
}