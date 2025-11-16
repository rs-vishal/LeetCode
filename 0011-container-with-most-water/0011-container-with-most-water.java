class Solution {
    public int maxArea(int[] height) {
        int left =0,right = height.length-1;
        int maxarea = Integer.MIN_VALUE;
        while(left<=right){
            int mid = Math.min(height[left],height[right]);
            int wid =  right - left;

            maxarea = Math.max(maxarea,mid*wid);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}