/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    int maxfreq = 0;
    public int[] findMode(TreeNode root) {
        inorder(root);        
        List<Integer> ar = new ArrayList<>();
        for(Map.Entry<Integer,Integer> a : map.entrySet()){
            if(a.getValue() == maxfreq){
                ar.add(a.getKey());
            }
        }
        int [] res = new int[ar.size()];
        for(int i=0;i<ar.size();i++){
            res[i] = ar.get(i);
        }
        return res;
    }
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left); 
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        maxfreq = Math.max(maxfreq,map.get(root.val));
        inorder(root.right);  
    }
}