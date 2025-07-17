class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int a = Math.min(p.val, q.val);
        int b = Math.max(p.val, q.val);

        int r = root.val;

        if(a < r && b < r && root.left != null) return lowestCommonAncestor(root.left, p, q);
        if(a > r && b > r && root.right != null) return lowestCommonAncestor(root.right, p, q);

        return root;
    }
}