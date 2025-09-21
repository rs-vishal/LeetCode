class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return inorder(p, q);
    }

    public boolean inorder(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;        
        return inorder(p.left, q.left) && inorder(p.right, q.right);
    }
}