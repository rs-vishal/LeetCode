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
    public int maxDepth(TreeNode root) {
        return(maxheight(root));
    }
    public int maxheight(TreeNode root){
        if(root == null) return 0;
        int lh = maxheight(root.left);
        int rh = maxheight(root.right);

        return Math.max(lh,rh)+1;
    }
}