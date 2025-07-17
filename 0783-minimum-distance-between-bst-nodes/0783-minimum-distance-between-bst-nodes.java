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
    Integer pre=null;
    int mindiff=Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        traverse(root);
        return mindiff;
    }

    public void traverse(TreeNode root){
        if(root==null)return;
        traverse(root.left);
        if(pre!=null){
            mindiff=Math.min(mindiff,root.val-pre);
        }
        pre=root.val;
        traverse(root.right);
    }
}