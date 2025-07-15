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
    int curr=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        left(true,root.left);
        left(false,root.right);

        return curr;
         
        
    }

    public void left(boolean isleft,TreeNode root){
        if(root==null)return;
        if(root.left==null&&root.right==null&&isleft)curr+=root.val;
        left(true,root.left);
        left(false,root.right);
    }
}