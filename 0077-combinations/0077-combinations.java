class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(n,k,1,new ArrayList<>());
        return result;
    }
    public void backtrack(int n, int k ,int start,  List<Integer> subset){
        if(subset.size() == k){
            result.add(new ArrayList<>(subset));
        }
        else{
            for(int i=start;i<=n;i++){
                subset.add(i);
                backtrack(n,k,i+1,subset);
                subset.remove(subset.size()-1);

            }
        }
    }
}