class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        if( k ==0){
            res.add(new LinkedList());
            return res;
        }
        backtrack(1,new LinkedList<Integer>(),n,k,res);
        return res;
    }
    public void backtrack(int start,LinkedList<Integer> cur,int n,int k ,List<List<Integer>> res){
        if(cur.size()== k) res.add(new LinkedList(cur));

        for(int i=start;i<=n && cur.size()<k ; i++){
            cur.add(i);
            backtrack(i+1,cur,n,k,res);
            cur.removeLast();
         }
    }
}