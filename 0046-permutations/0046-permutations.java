class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result,nums,0);
        return result;
    }
    public void backtrack(List<List<Integer>> result,int []nums,int start){
        if(start == nums.length){
             result.add(toList(nums));
        }
        else{
            for(int i=start;i<nums.length;i++){
                swap(i,start,nums);
                backtrack(result,nums,start+1);
                swap(i,start,nums);
            }
        }     
    }
    public List<Integer> toList(int []nums){
        List<Integer> res = new ArrayList<>();
        for(int num :nums)  res.add(num);
        return res;
    }
    public void swap(int i,int start , int[] nums){
            int temp= nums[i];
            nums[i] = nums[start];
            nums[start] = temp;
    }
}