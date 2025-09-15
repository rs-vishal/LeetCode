class Solution {
    public List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,0,new ArrayList<>());
        return result;
    }
    public void backtrack(int []nums , int index , List<Integer> cur){
        if(cur.size() == nums.length){
            result.add(new ArrayList<>(cur));
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(cur.contains(nums[i])) continue;
                cur.add(nums[i]);
                backtrack(nums,i+1,cur);
                cur.remove(cur.size()-1);
            }
        }
    }
}