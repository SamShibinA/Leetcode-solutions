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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int rootdia=maxheight(root.left)+maxheight(root.right);
        return Math.max(rootdia,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));

    }

    public int maxheight(TreeNode root){
        if(root==null)return 0;
        return Math.max(maxheight(root.left),maxheight(root.right))+1;

    }

}