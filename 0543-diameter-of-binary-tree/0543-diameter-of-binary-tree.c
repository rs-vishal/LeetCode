/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


int dia =0;
int deep(struct TreeNode* node){
    if(node == NULL) return 0;
    int right = deep(node->right);
    int left = deep(node->left);
 if (left + right > dia) {
        dia = left + right;
    }

    return (left > right ? left : right) + 1;
}
int diameterOfBinaryTree(struct TreeNode* root) {
    dia =0;
    deep(root);
    return dia;
}
