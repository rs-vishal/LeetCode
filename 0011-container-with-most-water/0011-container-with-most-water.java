class Solution {
    public int maxArea(int[] height) {
        int left =0 , right = height.length-1;
        int maxarea =0;
        while(left<= right){
            int min = Math.min(height[left],height[right]);
            int wid = right- left;

            maxarea = Math.max(maxarea,min*wid);
            if(height[left] < height[right]){
                left++;
            }
            // else if(height[left] > height[right]){
            else{
                right--;
            }
        }
        return maxarea;
    }
}