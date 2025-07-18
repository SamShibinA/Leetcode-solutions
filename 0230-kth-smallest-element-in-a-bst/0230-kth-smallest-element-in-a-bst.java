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
    int K;
    public int kthSmallest(TreeNode root, int k) {
        K=k;
        return traverse(root);
    }

    public int traverse(TreeNode root){
        if(root==null)return -1;

        int l=traverse(root.left);
        if(l!=-1)return l;
        K--;
        if(K==0)return root.val;

        int r=traverse(root.right);
        return r;
    }
}