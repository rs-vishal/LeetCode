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
    public int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        depthtree(root);   
        return diameter;     
    }
    public int depthtree(TreeNode node){
        if(node==null) return 0;

        int left = depthtree(node.left);
        int right = depthtree(node.right);

        diameter=(Math.max(diameter,left+right));

        return Math.max(left,right)+1;

    }
}